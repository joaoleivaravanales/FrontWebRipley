package pages;

import net.serenitybdd.core.pages.PageObject;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import step.stepRipley;

public class ripleyHome {
    //WebDriver driver;
    @FindBy(xpath = "//*[@id=\"ripley-sticky-header\"]/section/nav/div/div[2]/div[1]/div/div/a/div/div/span")
    protected WebElement clicLogin;


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
}
