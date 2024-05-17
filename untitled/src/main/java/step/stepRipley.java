package step;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import pages.RipleyHome;

import java.sql.Driver;


public class stepRipley {

    WebDriver driver = new ChromeDriver();
    RipleyHome ripley = new RipleyHome(driver);
    @Given("Cuando ingreso a la pagina de Ripley")
    public void cuandoIngresoALaPaginaDeRipley() {
    ripley.ingresar();
   }

    @When("Valido que efectivamente me encuentro en el menu de ripley")
    public void validoQueEfectivamenteMeEncuentroEnElMenuDeRipley() {
        ripley.ingresarClick();
    }

    @And("Ingreso correo {string} contrasena en el campo {string} en la pagina login")
    public void ingresoCorreoContrasenaEnElCampoEnLaPaginaLogin(String arg0, String arg1) {
        ripley.credencialesAcceso(arg0,arg1);
    }

    @And("presiono el boton de {string} posicionado en la pantalla de login")
    public void presionoElBotonDePosicionadoEnLaPantallaDeLogin(String arg0) {
        ripley.botonesPaginaRipley(arg0);
    }

    @Then("Verifico el siguiente texto de error en el login")
    public void verificoElSiguienteTextoDeErrorEnElLogin(String arg0) {
        ripley.visualizacionesTexto(arg0);
    }
}