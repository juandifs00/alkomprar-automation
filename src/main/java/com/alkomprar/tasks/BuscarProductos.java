package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.JavaScriptClick;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductos implements Task {
    private String categoria;
    private String caracteristica;
    private String valor;
    private String marca;

    public BuscarProductos(String categoria, String caracteristica, String valor, String marca) {
        this.categoria = categoria;
        this.caracteristica = caracteristica;
        this.valor = valor;
        this.marca = marca;
    }

    public static Performable elemento(String categoria, String caracteristica, String valor, String marca) {
        return instrumented(BuscarProductos.class, categoria, caracteristica, valor, marca);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(CATEGORIA.of(categoria)),
                WaitUntil.the(FILTER_BAR.of(categoria), isVisible()),
                Scroll.to(SELECT_CHECK_BOX.of("brand", marca)).andAlignToTop(),
                JavaScriptClick.on(SELECT_CHECK_BOX.of("brand", marca)),
                JavaScriptClick.on(SELECT_CHECK_BOX.of(caracteristica, valor))
        );

    }
}
