package step;

import io.cucumber.java.After;
import io.cucumber.java.Before;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.FindBy;
import pages.ripleyHome;

import java.util.concurrent.TimeUnit;

public class stepRipley {

    WebDriver driver = new ChromeDriver();
    ripleyHome ripley = new ripleyHome();

    public void abrirNavegadorURL() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Jooao/Desktop/Joao/Front automatizacion web/untitled/src/main/resources/drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://simple.ripley.cl/");
    }

    @Given("Cuando ingreso a la pagina de Ripley")
    public void cuandoIngresoALaPaginaDeRipley() {
        abrirNavegadorURL();
        System.out.println("Entro 1");

    }

    @After
    public void cerrarNavegador() {
        driver.quit();
    }

    @When("Valido que efectivamente me encuentro en el menu de ripley")
    public void validoQueEfectivamenteMeEncuentroEnElMenuDeRipley() {
        System.out.println("entro 2");
    }

    @And("Selecciono la opcion de {string} en la parte superior de la Pagina")
    public void seleccionoLaOpcionDeEnLaParteSuperiorDeLaPagina(String arg0) {
        System.out.println("entro 3");
        ripley.textosPagina(arg0);
        System.out.println("salida del 3");
    }
}