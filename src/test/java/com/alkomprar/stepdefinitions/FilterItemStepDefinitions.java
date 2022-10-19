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
    public void quiereEncontrarConDe(String string, String string2, String string3, String string4, String string5) {
        // Write code here that turns the phrase above into concrete actions
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


    @Cuando("{string} quiere comprar un articulo de las categorias {string}, {string}, {string}  y {string}")
    public void rodolfoQuiereComprarUnCelularComputadorTvYLlanta(String actor, String categoria1, String categoria2, String categoria3, String categoria4) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                AgregarAlCarrito.elemento(categoria1),
                AgregarAlCarrito.elemento(categoria2),
                AgregarAlCarrito.elemento(categoria3),
                AgregarAlCarrito.elemento(categoria4)
        );
    }
    @Entonces("debe ver {int} articulos en el carrito")
    public void debeVerEnElCarrito(int cantidadArticulos) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(cantidadArticulos)
        );
    }

    @Cuando("{string} quiere comprar un {string}")
    public void rodolfoQuiereComprarUnIphone(String actor, String item) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarYAgregarCarrito.elemento(item)
        );
    }
    @Entonces("debe ver en el carrito de comprar {string}")
    public void debeVerEnElCarritoDeComprarIphone(String item) {
        theActorInTheSpotlight().attemptsTo(
                Click.on(CARRITO.of(item)),
                Ensure.that(ARTICULOS_CARRITO).values().hasSize(1)
        );
    }

}
