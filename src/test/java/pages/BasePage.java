package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by Valeriia_Bezrodna on 10/25/2018.
 */
abstract public class BasePage {
     protected WebDriver driver;

     public BasePage(WebDriver driver, String url) {
          PageFactory.initElements(driver, this);
          this.driver = driver;
          driver.get(url);
     }
}
