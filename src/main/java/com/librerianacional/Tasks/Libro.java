package com.librerianacional.Tasks;

import com.librerianacional.Interactions.RetrocederPag;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;

public class Libro implements Task {
    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                RetrocederPag.on()
        );

    }

    public static Performable on(){
        return Instrumented.instanceOf(Libro.class).withProperties();
    }
}
