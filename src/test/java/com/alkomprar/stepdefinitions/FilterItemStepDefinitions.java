package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.AgregarAlCarrito;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.CARRITO;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

public class FilterItemStepDefinitions {

    @Cuando("{string} quiere encontrar {string} {string} con {string} de {string}")
    public void quiereEncontrarConDe(String actor, String categoria, String marca, String valorCaracteristica, String caracteristica) {
        // Write code here that turns the phrase above into concrete actions
        theActorCalled(actor).attemptsTo(
            Open.url("https://www.alkosto.com/"),

        );
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe ver la lista hasta con {string} items")
    public void debeVerLaListaHastaConItems(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Cuando("{string} quiere buscar productos {string} y ordenarlos en un {string}")
    public void quiereBuscarProductosYOrdenarlosEnUn(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe ver una lista con productos en estilo {string}")
    public void debeVerUnaListaConProductosEnEstilo(String string) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }


    @Cuando("{string} quiere Buscar los horarios de atencion en el {string} en {string}")
    public void quiereBuscarLosHorariosDeAtencionEnElEn(String string, String string2, String string3) {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }
    @Entonces("debe ver los horarios de atencion")
    public void debeVerLosHorariosDeAtencion() {
        // Write code here that turns the phrase above into concrete actions
        throw new io.cucumber.java.PendingException();
    }

}
