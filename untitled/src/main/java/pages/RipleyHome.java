package pages;

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
    Utilidades utilidades = new Utilidades();

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

    @FindBy(xpath = "//*[contains(text(),'¿Olvidaste tu contraseña?')]")
    WebElement btnOlvidasteContrasena;

    @FindBy(xpath = "//p[contains(text(),'Recuperar cuenta')]")
    WebElement txtRecuperarCuenta;

    @FindBy(xpath = "//button[contains(text(),'Buscar cuenta')]")
    WebElement btnBuscarCuenta;

    @FindBy(xpath = "//span[contains(text(),'No se ha podido enviar el correo')]")
    WebElement txtUserInexistente;

    @FindBy(xpath = "//p[contains(text(),'Enviamos un enlace para que puedas recuperar tu cuenta a')]")
    WebElement txtUsuarioExistenteOlvidarPass;

    public void ingresar(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Jooao/Desktop/Joao/Front automatizacion web/untitled/src/main/resources/drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.navigate().to("https://simple.ripley.cl/");
    }
    public void credencialesAcceso(String arg0, String arg1){
        try{
            utilidades.highlightElement(driver, usuarioLogin);
            usuarioLogin.sendKeys(arg0);
            utilidades.highlightElement(driver, passwordLogin);
            passwordLogin.sendKeys(arg1);
        }catch (Exception e){
            logger.error("************************ ERROR AL MOMENTO DE INGRESAR CREDENCIALES ************************");
        }

    }

    public void ingresarClick() {
        try {
            utilidades.highlightElement(driver, clicLogin);
            clicLogin.click();
        }catch (Exception e){
            logger.error("************************ ERROR AL PRESIONAR EL BOTON DE INICIAR SESION HOME ************************");
        }
    }

    public void botonesPaginaRipley(String arg0) {
        switch (arg0){
            case "Iniciar Sesion":
                try{
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    utilidades.highlightElement(driver, btnIniciarSesion);
                    btnIniciarSesion.click();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR AL PRESIONAR EL BOTON DE INICIAR SESION CREDENCIALES ************************");
                    break;
                }
            case "Olvidaste Contrasena":
                try{
                    btnOlvidasteContrasena.click();
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR AL PRESIONAR EL BOTON DE OLVIDAR TU PASSWORD ************************");
                    break;
                }
            case "Buscar Cuenta":
                try{
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    utilidades.highlightElement(driver, btnBuscarCuenta);
                    btnBuscarCuenta.click();
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR AL PRESIONAR EL BOTON DE BUSCAR CUENTA ************************");
                    break;
                }
            default:
                logger.error("************************ERROR EN EL METODO************************ ");
        }
    }

    public void ingresoRutOlvidoPass(String arg0){
        try{
            utilidades.highlightElement(driver, usuarioLogin);
            usuarioLogin.sendKeys(arg0);
        }catch (Exception e){
            logger.error("*********************** ERROR AL INGRESAR EL RUT DEL CLIENTE ************************");
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
                    break;
                }
            case "Recuperar cuenta":
                try {
                    utilidades.highlightElement(driver, txtRecuperarCuenta);
                    Assert.assertEquals("Recuperar cuenta",txtRecuperarCuenta.getText());
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR EL TEXTO NO COINCIDE ************************");
                    break;
                }
            case "No se ha podido enviar el correo":
                try {
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    Assert.assertEquals("No se ha podido enviar el correo",txtUserInexistente.getText());
                   driver.quit();
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR EL TEXTO NO COINCIDE ************************");
                    break;
                }
            case "Enviamos un enlace para que puedas recuperar tu cuenta a":
                try{
                    driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
                    Assert.assertEquals("Enviamos un enlace para que puedas recuperar tu cuenta a",txtUsuarioExistenteOlvidarPass.getText());
                    driver.quit();
                    break;
                }catch (Exception e){
                    logger.error("************************ ERROR EL TEXTO NO COINCIDE ************************");
                    break;
                }
            default:
                logger.error("************************ERROR EN EL METODO VISUALIZACIONESTEXT()************************ ");
        }
    }

    @AfterTest
    public void cerrarPestaña(){
        driver.quit();
    }
}
