package pages;

import org.junit.After;
import org.junit.Assert;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.testng.annotations.AfterTest;

import java.util.concurrent.TimeUnit;

public class RipleyHome {

    WebDriver driver;
    private static final Logger logger = LoggerFactory.getLogger(RipleyHome.class);
    public RipleyHome(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }

    @FindBy(xpath = "//*[@id='ripley-sticky-header']/section/nav/div/div[2]/div[1]/div/div/a/div/div/span")
    WebElement clicLogin;

    @FindBy(name = "identifier")
    WebElement usuarioLogin;

    @FindBy(xpath = "//*[@name='password']")
    WebElement passwordLogin;

    @FindBy(xpath = "//button[contains(text(),'Iniciar sesión')]")
    WebElement btnIniciarSesion;

    @FindBy(xpath = "//span[contains(text(),'El usuario ingresado no está registrado en Ripley.')]")
    WebElement msgIncorrectLogin;


    public void ingresar(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Jooao/Desktop/Joao/Front automatizacion web/untitled/src/main/resources/drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.navigate().to("https://simple.ripley.cl/");
    }
    public void credencialesAcceso(String arg0, String arg1){
        try{
            usuarioLogin.sendKeys(arg0);
            passwordLogin.sendKeys(arg1);
        }catch (Exception e){
            logger.error("************************ ERROR AL MOMENTO DE INGRESAR CREDENCIALES ************************");
        }

    }

    public void ingresarClick() {
        try {
            clicLogin.click();
        }catch (Exception e){
            logger.error("************************ ERROR AL PRESIONAR EL BOTON DE INICIAR SESION HOME ************************");
        }
    }

    public void botonesPaginaRipley(String arg0) {
        switch (arg0){
            case "Iniciar Sesion":
                try{
                    btnIniciarSesion.click();
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR AL PRESIONAR EL BOTON DE INICIAR SESION CREDENCIALES ************************");
                }
            case "hola":
                logger.info("ee");
                break;
        }
    }

    public void visualizacionesTexto(String arg0) {
        switch (arg0){
            case "El usuario ingresado no está registrado en Ripley.":
                try {
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    Assert.assertEquals("El usuario ingresado no está registrado en Ripley.",msgIncorrectLogin.getText());
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR EL TEXTO NO COINCIDE ************************");
                }
        }
    }
    @AfterTest
    public void closeAfter(){
        driver.close();
    }
}
