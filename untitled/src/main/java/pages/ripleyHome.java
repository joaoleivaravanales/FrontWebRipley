package pages;

import io.appium.java_client.pagefactory.AndroidFindBy;
import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ripleyHome extends PageObject{

    @FindBy(xpath="//*[@id=\"ripley-sticky-header\"]")
    protected static WebElement tituloRipley;

    @FindBy(id = "Inicia sesión")
    protected static WebElement iniciarSesion;

    public void validarHome(){
        tituloRipley.isDisplayed();
    }

    public void textosPagina(String arg0){
        switch (arg0) {
            case "Inicia sesion":
                iniciarSesion.click();
                break;
        }
    }
}
