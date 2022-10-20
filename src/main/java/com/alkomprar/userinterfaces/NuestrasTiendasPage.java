package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;

public class NuestrasTiendasPage {
    public static final Target FILTRO_CIUDADES = Target.the("Filtrar ciudad de {0}").locatedBy("//a[@aria-controls='{0}']");
	public static final Target CITIES_MENU = Target.the("Filtro Menu").locatedBy("//ul[@class='cities-menu']");
    public static final Target TIENDA_CARD = Target.the("Obteniendo Tienda {0}").locatedBy("//a[@title='{0}'][@class='click']");
    public static final Target TIENDA_DETALLE = Target.the("Detalle de la tienda").locatedBy("//div[@class='contenedor_tienda_detalle']");
    public static final Target HORARIOS = Target.the("Horario Tienda").locatedBy("//div[@class='horarios_detalle']/p[1]/strong/text()[1]");
    
}