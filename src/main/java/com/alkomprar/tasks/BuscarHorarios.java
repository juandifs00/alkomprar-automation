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
    private String ciudad;

    public BuscarHorarios(String tiendas, String ciudad) {
        this.tiendas = tiendas;
        this.ciudad = ciudad;
    }

    public static Performable elemento(String tiendas, String ciudad) {
        return instrumented(BuscarHorarios.class, tiendas, ciudad);
    }

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Click.on(LOCATIONS.of(tiendas)),
                WaitUntil.the(CITIES_MENU, isVisible()),
                Click.on(FILTRO_CIUDADES.of(ciudad))
        );
    }
}
