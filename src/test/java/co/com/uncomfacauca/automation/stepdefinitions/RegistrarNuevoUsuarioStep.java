package co.com.uncomfacauca.automation.stepdefinitions;

import co.com.unicomfacauca.automation.userinterfaces.FacebookHomePage;
import cucumber.api.java.Before;
import cucumber.api.java.es.Cuando;
import cucumber.api.java.es.Dado;
import cucumber.api.java.es.Entonces;
import net.serenitybdd.screenplay.Actor;
import net.serenitybdd.screenplay.abilities.BrowseTheWeb;
import net.serenitybdd.screenplay.actions.Open;
import net.serenitybdd.screenplay.actors.OnStage;
import net.serenitybdd.screenplay.actors.OnlineCast;
import net.thucydides.core.annotations.Managed;
import net.thucydides.core.pages.PageObject;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import static net.serenitybdd.screenplay.actors.OnStage.theActorCalled;
import static net.serenitybdd.screenplay.actors.OnStage.theActorInTheSpotlight;

import java.util.List;

public class RegistrarNuevoUsuarioStep {

    private PageObject facebookHomePage = new FacebookHomePage();

    @Before
    public void setTheStage(){
        OnStage.setTheStage(new OnlineCast());
    }


    @Dado("^que un nuevo usuario (.*) accede a la pagina de facebook$")
    public void queUnNuevoUsuarioAccedeALaPaginaDeFacebook(String nombre) {
        theActorCalled(nombre).wasAbleTo(
                Open.browserOn(facebookHomePage)
        );
    }


    @Cuando("^el diligencia los campos de resgitro$")
    public void elDiligenciaLosCamposDeResgitro(List<String> datos) {

    }

    @Cuando("^selecciona la opcion Guardar registrate$")
    public void seleccionaLaOpcionGuardarRegistrate() {

    }

    @Entonces("^el deberia ver la interfaz de confirmar registro$")
    public void elDeberiaVerLaInterfazDeConfirmarRegistro() {

    }

}
