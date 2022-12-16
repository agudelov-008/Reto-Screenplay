package com.librerianacional.UserInterface;


import net.serenitybdd.screenplay.targets.Target;

public class LnPagPpalUI {

    public static final Target LBL_NOVEDADES = Target.the("Label Novedades")
            .locatedBy("//a[contains(text(),'Novedades')]");

    public static final Target IMG_LIBROS = Target.the("IMG LIBROS")
            .locatedBy("//div[@class='owl-item active']");
    public static final Target TXT_LIBROS = Target.the("LIBROS")
            .locatedBy("//a[@class='d-flex text--blue text--sm text--lh-1 text--bold book-title' and @href]");

    public static final Target BTN_FLECHA_DERECHA =Target.the("Felcha carrucel")
            .locatedBy("//div[@class='owl-next']");

    public static final Target SLD_CARRUCELPPAL = Target.the("Carrucel Principal")
            .locatedBy("//div[@class='slick-list']");

    public static final Target IMG_LOGO = Target.the("Logo LibreriaNacional")
            .locatedBy("//img[@src='assets/images/libreria-nacional-logo-rwd.png']");

    public static final Target BTN_FLECHA_PREV =Target.the("Felcha previa carrucel")
            .locatedBy("//*[@id='nav-carousel-novedades']/div[1]");
}
