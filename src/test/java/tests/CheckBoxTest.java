package tests;

import org.assertj.core.api.Assertions;
import org.testng.annotations.Test;
import pages.CheckBoxClass;

/**
 * Created by Valeriia_Bezrodna on 10/25/2018.
 */
public class CheckBoxTest extends BaseTest {

    @Test
    public void singleCheckBoxTest() {
        String outputMessage = new CheckBoxClass(driver).singleCheckBox();
        Assertions.assertThat(outputMessage).isEqualTo("Success - Check box is checked");
    }
}
