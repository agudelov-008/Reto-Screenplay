package com.librerianacional.StepDefinitions;

import com.librerianacional.Driver.SeleniumWebDriver;
import com.librerianacional.Questions.ValidacionBtnAgregarAlCarrito;
import com.librerianacional.Questions.ValidacionPagPpal;
import com.librerianacional.Tasks.Libro;
import com.librerianacional.Tasks.PagPpal;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import org.hamcrest.Matchers;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;


import java.io.IOException;

public class LnBackgroundStepDefinitions {

    private Actor camilo = Actor.named("Camilo");

    @Before
    public void before()throws IOException {
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^Me encuentro en la pagina de (.*)$")
    public void  meEncuentroEnLaPaginaDeHttpsLibrerianacionalCom(String Url) {
        camilo.can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }

    @Cuando("^Seleccionemos uun producto$")
    public void seleccionemosUunProducto() {
        camilo.attemptsTo(PagPpal.on());

    }

    @Cuando("^Validemos la interfaz de \"([^\"]*)\"$")
    public void validemosLaInterfazDe(String arg1) {
        camilo.should(seeThat("el actor puede ver", ValidacionBtnAgregarAlCarrito.validar(),
                Matchers.equalTo(true)));
    }

    @Entonces("^Volvemos a Home y validamos Home$")
    public void volvemosAHomeYValidamosHome() {
        camilo.attemptsTo(Libro.on());
        camilo.should(seeThat("el actor puede ver", ValidacionPagPpal.validarHome(),
                Matchers.equalTo(true)));
    }


}
