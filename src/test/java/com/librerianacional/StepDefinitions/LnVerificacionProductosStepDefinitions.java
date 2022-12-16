package com.librerianacional.StepDefinitions;

import com.librerianacional.Driver.SeleniumWebDriver;
import com.librerianacional.GlobalVar.Global;
import com.librerianacional.Interactions.RefrescarPag;
import com.librerianacional.Questions.ValidacionLogo;
import com.librerianacional.Tasks.Selecionar4toLibro;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import org.hamcrest.Matchers;
import org.junit.Assert;

import static net.serenitybdd.screenplay.GivenWhenThen.seeThat;

public class LnVerificacionProductosStepDefinitions {

    private Actor camilo = Actor.named("Camilo");


    @Dado("^Me encuentro en el apartado principal de la pagina de (.*)$")
    public void meEncuentroEnElApartadoPrincipalDeLaPaginaDeHttpsLibrerianacionalCom(String Url) {
        camilo.can(BrowseTheWeb.with(SeleniumWebDriver.ChromeWebDriver().on(Url)));
    }
    @Cuando("^Recargue la pagina y valide su logo$")
    public void recargueLaPaginaYValideSuLogo() {
        camilo.attemptsTo(RefrescarPag.on());
        camilo.should(seeThat("el actor puede ver", ValidacionLogo.validarLogo()
        , Matchers.equalTo(true)));
    }

    @Cuando("^Selecione el cuarto producto del home$")
    public void selecioneElCuartoProductoDelHome() {
        camilo.attemptsTo(Selecionar4toLibro.on());
    }

    @Entonces("^Podra visualizar el producto escogido$")
    public void podraVisualizarElProductoEscogido() {
        Assert.assertEquals(Global.Check,Global.CheckTitulo);
    }
}
