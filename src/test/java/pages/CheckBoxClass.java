package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

/**
 * Created by Valeriia_Bezrodna on 10/25/2018.
 */
public class CheckBoxClass extends BasePage{

    public CheckBoxClass(WebDriver driver) {
        super(driver, "https://seleniumeasy.com/test/basic-checkbox-demo.html");
    }

    @FindBy(id = "isAgeSelected")
    private WebElement singleCheckBox;

    @FindBy(id = "txtAge")
    private WebElement ageText;

    public String singleCheckBox() {
        singleCheckBox.click();
        return ageText.getText();
    }
}
