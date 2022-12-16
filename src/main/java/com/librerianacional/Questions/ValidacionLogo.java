package com.librerianacional.Questions;

import com.librerianacional.UserInterface.LnPagPpalUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;

public class ValidacionLogo implements Question {
    @Override
    public Boolean answeredBy(Actor actor) {
        return LnPagPpalUI.IMG_LOGO.resolveFor(actor).isVisible();

    }

    public static Question validarLogo (){
        return new ValidacionLogo();
    }
}