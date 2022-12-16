package com.librerianacional.Interactions;

import com.librerianacional.GlobalVar.Global;
import com.librerianacional.UserInterface.LnLibroUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class ObtenerTexto implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {

        Global.CheckTitulo= LnLibroUI.LBL_4toLIBRO.resolveFor(actor).getText();
    }

    public static Performable on(){
        return Instrumented.instanceOf(ObtenerTexto.class).withProperties();
    }

}
