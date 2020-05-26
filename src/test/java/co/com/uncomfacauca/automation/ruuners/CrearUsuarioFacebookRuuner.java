package co.com.uncomfacauca.automation.ruuners;

import cucumber.api.CucumberOptions;
import cucumber.api.SnippetType;
import net.serenitybdd.cucumber.CucumberWithSerenity;
import org.junit.runner.RunWith;

@RunWith(CucumberWithSerenity.class)
@CucumberOptions(features= "src/test/resources/features/registrarnuevousuario.feature",
                glue = {"co.com.uncomfacauca.automation"},
        tags = {"@ValidarCreacionNuevoUsuario"},
        snippets = SnippetType.CAMELCASE)
public class CrearUsuarioFacebookRuuner {

}
