package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NuestrasTiendasPage {
    public static final Target FILTRO_CIUDADES = Target.the("Filtrar ciudad de {0}").locatedBy("//a[@aria-controls='{0}']");
	public static final Target CITIES_MENU = Target.the("Filtro Menu").locatedBy("//ul[@class='cities-menu']");
}