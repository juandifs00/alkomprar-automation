package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.MoveMouse;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.ConfirmacionCarritoPage.CERRAR_MODAL;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.AGREGAR_ELEMENTO_CARRITO;
import static com.alkomprar.userinterfaces.DetalleArticuloPage.DIV_PRIMER_ELEMENTO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isClickable;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;

public class FiltrarElementos implements Task {
    private String categoria;
    private String caracteristica;
    private String valor;
    private String marca;

    public FiltrarElementos(String categoria, String caracteristica, String valor, String marca) {
        this.categoria = categoria;
        this.caracteristica = caracteristica;
        this.valor = valor;
        this.marca = marca;
    }

    public static Performable elemento(String categoria, String caracteristica, String valor, String marca) {
        return instrumented(FiltrarElementos.class, categoria, caracteristica, valor, marca);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        WebDriver driver = new ChromeDriver();
        JavascriptExecutor js = (JavascriptExecutor)driver;

        driver.get("https://www.alkosto.com/");

        actor.attemptsTo(
                Click.on(CATEGORIA.of(categoria)),
                WaitUntil.the(FILTER_BAR.of(categoria), isVisible()),
                Scroll.to(SELECT_CHECK_BOX.of("brand", marca)).andAlignToTop(),
                Click.on(SELECT_CHECK_BOX.of("brand", marca)),
                Click.on(SELECT_CHECK_BOX.of(caracteristica, valor)),
                
                
        );

        js.executeScript("document.getElementById('js-add-cart-6934177767241').click();");
    }
}
