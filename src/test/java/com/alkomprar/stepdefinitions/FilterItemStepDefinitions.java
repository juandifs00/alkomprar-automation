package com.alkomprar.stepdefinitions;

import com.alkomprar.tasks.FiltrarElementos;
import com.alkomprar.tasks.BuscarHorarios;
import com.alkomprar.tasks.BuscarProductos;
import com.alkomprar.tasks.BuscarYAgregarCarrito;
import io.cucumber.java.ast.Cuando;
import io.cucumber.java.es.Entonces;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.ensure.Ensure;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.alkomprar.userinterfaces.CarritoPage.ARTICULOS_CARRITO;
import static com.alkomprar.userinterfaces.MenuPage.*;
import static com.alkomprar.userinterfaces.NuestrasTiendasPage.HORARIOS;
import static com.alkomprar.userinterfaces.NuestrasTiendasPage.TIENDA_DETALLE;
import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isVisible;

public class FilterItemStepDefinitions {

    /*
    @Cuando("{string} quiere encontrar {string} {string} con {string} de {string}")
    public void quiereEncontrarConDe(String actor, String categoria, String marca, String valorCaracteristica, String caracteristica) {
        theActorCalled(actor).attemptsTo(
            Open.url("https://www.alkosto.com/"),
            FiltrarElementos.elemento(categoria, caracteristica, valorCaracteristica, marca)
        );
    }
    @Entonces("debe ver la lista hasta con {int} items")
    public void debeVerLaListaHastaConItems(int maxItem) {
        theActorInTheSpotlight().attemptsTo(
                WaitUntil.the(FILTERED_ITEMS, isVisible()),
                Ensure.that(FILTERED_ITEMS).values().hasSizeLessThanOrEqualTo(maxItem)
        );
    }


    @Cuando("{string} quiere buscar productos {string} y ordenarlos en un {string}")
    public void quiereBuscarProductosYOrdenarlosEnUn(String actor, String marca, String listType) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarProductos.elemento(marca, listType)
        );
    }
    @Entonces("debe ver una lista con productos en estilo {string}")
    public void debeVerUnaListaConProductosEnEstilo(String listType) {
        theActorInTheSpotlight().attemptsTo(
                Ensure.that(LIST_CATEGORY_ITEMS.of(listType)).values().hasSizeGreaterThan(0)
        );
    }

     */

    @Cuando("{string} quiere Buscar los horarios de atencion en el {string} en {string}")
    public void quiereBuscarLosHorariosDeAtencionEnElEn(String actor, String tienda, String ciudad) {
        theActorCalled(actor).attemptsTo(
                Open.url("https://www.alkosto.com/"),
                BuscarHorarios.elemento(tienda, ciudad)
        );
    }
    @Entonces("debe ver los horarios de atencion de {string}")
    public void debeVerLosHorariosDeAtencion(String horario) {
        theActorInTheSpotlight().attemptsTo(
            Ensure.that(HORARIOS).value().text().isNotEmpty()
        );
    }

}
