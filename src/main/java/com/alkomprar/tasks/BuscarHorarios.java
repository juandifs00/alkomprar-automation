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

public class BuscarHorarios implements Task {
    private String tiendas;

    public BuscarHorarios(String tiendas) {
        this.tiendas = tiendas;
    }

    public static Performable elemento(String tiendas) {
        return instrumented(BuscarHorarios.class, tiendas);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LOCATIONS.of(tiendas)),
                WaitUntil.the(FILTER_BAR.of(tiendas), isVisible())
        );
    }
}
