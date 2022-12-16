package com.librerianacional.Questions;

import com.librerianacional.UserInterface.LnPagPpalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionPagPpal implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LnPagPpalUI.SLD_CARRUCELPPAL.resolveFor(actor).isVisible();

    }

    public static Question validarHome (){
        return new ValidacionPagPpal();
    }
}
