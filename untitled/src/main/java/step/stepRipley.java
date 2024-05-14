package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class stepRipley {
    WebDriver driver = null;

    @Given("Cuando ingreso a la pagina de Ripley")
    public void cuandoIngresoALaPaginaDeRipley() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Jooao/Desktop/Joao/Front automatizacion web/untitled/src/main/resources/drivers/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(5, TimeUnit.SECONDS);
        driver.manage().window().maximize();
        driver.get("https://simple.ripley.cl/");
    }

    @After
    public void cerrarNavegador(){
        driver.quit();
    }

    @When("Valido que efectivamente me encuentro en el menu de ripley")
    public void validoQueEfectivamenteMeEncuentroEnElMenuDeRipley() {
        
    }

    @And("Selecciono la opcion de {string} en la parte superior de la Pagina")
    public void seleccionoLaOpcionDeEnLaParteSuperiorDeLaPagina(String arg0) {
        
    }

    @And("Ingreso texto el nombre de usuario {string}")
    public void ingresoTextoElNombreDeUsuario(String arg0) {
        
    }

    @Then("Verifico que efectivamente me encuentre en el login")
    public void verificoQueEfectivamenteMeEncuentreEnElLogin() {
    }
}
