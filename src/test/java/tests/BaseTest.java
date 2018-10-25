package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

/**
 * Created by Valeriia_Bezrodna on 10/25/2018.
 */
public class BaseTest {
    protected WebDriver driver;

    @BeforeMethod
    protected void setup() {
//        System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
//        driver = new ChromeDriver();

        System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
        driver = new FirefoxDriver();
    }

    @AfterMethod
    protected void quit() {
        driver.quit();
    }
}
