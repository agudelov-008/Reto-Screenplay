package com.librerianacional.UserInterface;


import net.serenitybdd.screenplay.targets.Target;

public class LnLibroUI {

    public static final Target BTN_AGREGAR_AL_CARRITO= Target.the("Boton Agregar al carrito")
            .locatedBy("//div[@class='mt-0 mt-md-2 mt-lg-0']");

    public static final Target LBL_4toLIBRO = Target.the("Label 4to Libro")
            .locatedBy("//div[@class='col-md-9 px-0']");
}
