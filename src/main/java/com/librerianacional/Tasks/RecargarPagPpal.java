package com.librerianacional.Tasks;

import com.librerianacional.Interactions.RefrescarPag;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class RecargarPagPpal implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {
        actor.attemptsTo(

                RefrescarPag.on()

        );
    }

    public static Performable on(){
        return Instrumented.instanceOf(RecargarPagPpal.class).withProperties();
    }
}
