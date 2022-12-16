package com.librerianacional.Tasks;

import com.librerianacional.Interactions.ObtenerTexto;
import com.librerianacional.Interactions.SeleccionarIndex;
import com.librerianacional.UserInterface.LnLibroUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import static com.librerianacional.UserInterface.LnPagPpalUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

public class Selecionar4toLibro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LBL_NOVEDADES),
                Click.on(BTN_FLECHA_PREV),
                SeleccionarIndex.on(),
                WaitUntil.the(LnLibroUI.BTN_AGREGAR_AL_CARRITO, isCurrentlyVisible()).forNoMoreThan(20).seconds(),
                ObtenerTexto.on()


        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(Selecionar4toLibro.class).withProperties();
    }

}
