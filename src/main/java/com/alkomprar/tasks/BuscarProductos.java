package com.alkomprar.tasks;

import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.*;
import net.serenitybdd.screenplay.actions.type.Type;
import net.serenitybdd.screenplay.waits.WaitUntil;
import org.openqa.selenium.Keys;

import static com.alkomprar.userinterfaces.MenuPage.*;
import static net.serenitybdd.screenplay.Tasks.instrumented;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class BuscarProductos implements Task {
    private String marca;
    private String listType;

    public BuscarProductos(String marca, String listType) {
        this.marca = marca;
        this.marca = listType;
    }

    public static Performable elemento(String marca, String listType) {
        return instrumented(BuscarProductos.class, marca, listType);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Type.theValue(item).into(TXT_BUSCAR),
                DoubleClick.on(TXT_BUSCAR),
                Hit.the(Keys.ENTER).into(TXT_BUSCAR),
                WaitUntil.the(LIST_CATEGORY.of(listType), isVisible()),
                Scroll.to(LIST_CATEGORY.of(listType)).andAlignToTop(),
                JavaScriptClick.on(LIST_CATEGORY.of(listType))
        );

    }
}
