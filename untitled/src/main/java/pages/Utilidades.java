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

    public static void miniScrollDown(WebDriver driver, int pixels) {
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("window.scrollBy(0, " + pixels + ");");
    }

    public static WebElement findElement(WebDriver driver, String locatorType, String locatorValue) {
        By locator = null;
        switch (locatorType.toLowerCase()) {
            case "id":
                locator = By.id(locatorValue);
                break;
            case "name":
                locator = By.name(locatorValue);
                break;
            case "classname":
                locator = By.className(locatorValue);
                break;
            case "tagname":
                locator = By.tagName(locatorValue);
                break;
            case "linktext":
                locator = By.linkText(locatorValue);
                break;
            case "partiallinktext":
                locator = By.partialLinkText(locatorValue);
                break;
            case "xpath":
                locator = By.xpath(locatorValue);
                break;
            case "cssselector":
                locator = By.cssSelector(locatorValue);
                break;
            default:
                System.out.println("Tipo de localizador no válido.");
        }
        return driver.findElement(locator);
    }

}
