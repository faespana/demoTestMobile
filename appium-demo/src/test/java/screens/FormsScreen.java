package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class FormsScreen extends LayoutScreen {
    public FormsScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Form components\")")
    private WebElement formsTitle;

    public String getTitleText() {
        super.waitElement(this.formsTitle);
        return this.formsTitle.getText();
    }
}
