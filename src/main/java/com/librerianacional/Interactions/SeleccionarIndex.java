package com.librerianacional.Interactions;

import com.librerianacional.GlobalVar.Global;
import com.librerianacional.UserInterface.LnPagPpalUI;
import net.serenitybdd.core.pages.WebElementFacade;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

import java.util.List;

public class SeleccionarIndex implements Interaction {
    @Override
    public <T extends Actor> void performAs(T actor) {
        List<WebElementFacade> ListaLibros = LnPagPpalUI.TXT_LIBROS.resolveAllFor(actor);
        Global.Check= ListaLibros.get(4).getText();
        ListaLibros.get(4).click();
    }

    public static Performable on(){
        return Instrumented.instanceOf(SeleccionarIndex.class).withProperties();
    }

    }

