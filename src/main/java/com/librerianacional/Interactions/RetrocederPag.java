package com.librerianacional.Interactions;

import com.librerianacional.Driver.SeleniumWebDriver;
import net.serenitybdd.core.steps.Instrumented;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.Interaction;
import net.serenitybdd.screenplay.Performable;

public class RetrocederPag implements Interaction {

    @Override
    public <T extends Actor> void performAs(T actor) {

        SeleniumWebDriver.driver.navigate().back();

    }
    public static Performable on(){

        return Instrumented.instanceOf(RetrocederPag.class).withProperties();

    }
}
