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
import pages.abrirNavegador;
import pages.ripleyHome;

import java.util.concurrent.TimeUnit;

public class stepRipley {
    abrirNavegador abrir = new abrirNavegador();
    ripleyHome ripley = new ripleyHome();

    @Given("Cuando ingreso a la pagina de Ripley")
    public void cuandoIngresoALaPaginaDeRipley() {
        System.out.println("Entro 1");
        abrir.abrirNavegadorURL();

    }

    @When("Valido que efectivamente me encuentro en el menu de ripley")
    public void validoQueEfectivamenteMeEncuentroEnElMenuDeRipley() {
        ripley.ingresarClick();
    }
}