package pages;

import net.serenitybdd.core.Serenity;
import org.junit.After;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Utilidades {

    //metodo para enfocar elementos en un recuadro verde
    public static void highlightElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].style.border='5px solid #00FF00';" +
                        "arguments[0].style.transform = 'scale(1.3)';", element);
    }

    public static void esperarElementoClickeable(WebDriver driver, String xpath){
        WebElement elemento = new WebDriverWait(driver, Duration.ofSeconds(10))
                .until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        elemento.click();
    }

}
