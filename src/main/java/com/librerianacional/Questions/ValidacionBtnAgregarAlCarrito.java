package com.librerianacional.Questions;

import com.librerianacional.UserInterface.LnLibroUI;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Question;


public class ValidacionBtnAgregarAlCarrito implements Question {

    @Override
    public Boolean answeredBy(Actor actor) {
        return LnLibroUI.BTN_AGREGAR_AL_CARRITO.resolveFor(actor).isVisible();
    }

    public static Question validar (){
        return new ValidacionBtnAgregarAlCarrito();
    }
}
