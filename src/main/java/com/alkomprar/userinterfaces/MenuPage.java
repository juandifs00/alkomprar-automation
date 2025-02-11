package com.alkomprar.userinterfaces;

import net.serenitybdd.screenplay.targets.Target;
import org.openqa.selenium.By;

public class MenuPage {
	public static final Target CATEGORIA = Target.the("Categoria {0} del menu").locatedBy("//li[@data-category='{0}']/a[@title='{0}']");
	public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//li[@data-category='{0}']//div[@data-subcategory]//li[@class='main-navigation__subcategory__items__subitems']/ul/li/a[@data-name]");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedBy("//a[@class=\"main-navigation__subcategory__subitem__label js-megamenu-datalayer-product\"]//../a[1]");
	//public static final Target PRIMER_SUB_CATEGORIA = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@title=\"Marca\"]//..//a[@data-name]");
	public static final Target CARRITO = Target.the("Primer subcategoria de {0}").locatedByFirstMatching("//a[@href='/cart']");
	public static final Target TXT_BUSCAR = Target.the("Buscador").locatedByFirstMatching("//input[@name='text']");
	public static final Target BUT_BUSCAR = Target.the("Boton Buscar").locatedBy("//button[@id='js-search-button']");
	public static final Target FILTER_BAR = Target.the("Filtros para la categoria {0}").locatedBy("//div[@class='facet-container__list']");
	public static final Target SELECT_CHECK_BOX = Target.the("Seleccionar Comprar por {0} valor: {1}").locatedBy("//*[@for='chk_{0}_{1}']");
	public static final Target FILTERED_ITEMS = Target.the("{0} Items filtrados").locatedBy("//ul[@class='product__listing product__list']/li");
	public static final Target LIST_CATEGORY = Target.the("Items listados como un {0}").locatedBy("//li[contains(concat(' ',normalize-space(@class),' '),' js-category-{0} ')]");
	public static final Target LIST_CATEGORY_ITEMS = Target.the("Items filtrados").locatedBy("//ul[@class='product__listing product__grid']/li");
	public static final Target LOCATIONS = Target.the("Localidades disponibles").locatedBy("//span[contains(text(), 'Nuestras tiendas')]");
	public static final Target ADDRESS = Target.the("Direcciones disponibles").locatedBy("//div[@class =  'store']");
}
 