package pages;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Utilidades {

    //metodo para enfocar elementos en un recuadro verde
    public static void highlightElement(WebDriver driver, WebElement element) {
        ((JavascriptExecutor) driver).executeScript(
                "arguments[0].style.border='5px solid #00FF00';" +
                        "arguments[0].style.transform = 'scale(1.3)';", element);
    }
}
