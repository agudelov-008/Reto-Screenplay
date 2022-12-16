package com.librerianacional.Tasks;

import com.librerianacional.UserInterface.LnLibroUI;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Performable;
import net.serenitybdd.screenplay.Task;
import net.serenitybdd.screenplay.actions.Click;
import net.serenitybdd.screenplay.actions.Scroll;
import net.serenitybdd.screenplay.waits.WaitUntil;

import java.util.Random;

import static com.librerianacional.UserInterface.LnPagPpalUI.*;
import static net.serenitybdd.screenplay.matchers.WebElementStateMatchers.isCurrentlyVisible;

//Tarea pagina principal
public class PagPpal implements Task {

    Random random = new Random();
    int aleatorio = random.nextInt(13+1);

    @Override
    public <T extends Actor> void performAs(T actor) {

        actor.attemptsTo(
                Scroll.to(LBL_NOVEDADES),
                Click.on(IMG_LIBROS),
                WaitUntil.the(LnLibroUI.BTN_AGREGAR_AL_CARRITO,isCurrentlyVisible()).forNoMoreThan(20).seconds()
        );
    }

    public static Performable on (){
        return Instrumented.instanceOf(PagPpal.class).withProperties();
    }


    public static void myClick(){
        Click.on(BTN_FLECHA_DERECHA);
    }
}
