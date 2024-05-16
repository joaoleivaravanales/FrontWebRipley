package pages;

import net.serenitybdd.core.pages.PageObject;
import net.serenitybdd.core.pages.PageObjects;
import org.openqa.selenium.*;
import org.openqa.selenium.support.FindBy;

public class ripleyHome {
    @FindBy(xpath = "//*[@id='ripley-sticky-header']/section/nav/div/div[2]/div[1]/div/div/a/div/div/span")
    public WebElement clicLogin;

    public void textosPagina(String arg0){
        switch (arg0) {
            case "Inicia sesion":
                // Thread.sleep(100);
                System.out.println(clicLogin);
                clicLogin.click();
                //WebElement elemento = driver.findElement(By.xpath("//*[@id=\"ripley-sticky-header\"]/section/nav/div/div[2]/div[1]/div/div/a/div/div/span"));
                //elemento.click();
                break;
        }
    }

    public void ingresarClick() {
        clicLogin.click();
        //WebElement elemento = driver.findElement(By.xpath("//*[@id='ripley-sticky-header']/section/nav/div/div[2]/div[1]/div/div/a/div/div/span"));
        //elemento.click();
    }
}
