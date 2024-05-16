package pages;

import io.cucumber.java.Before;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class abrirNavegador {
    WebDriver driver = new ChromeDriver();
    public void abrirNavegadorURL() {
        System.setProperty("webdriver.chrome.driver", "C:/Users/Jooao/Desktop/Joao/Front automatizacion web/untitled/src/main/resources/drivers/chromedriver.exe");
        driver.manage().window().maximize();
        driver.get("https://simple.ripley.cl/");
    }
}
