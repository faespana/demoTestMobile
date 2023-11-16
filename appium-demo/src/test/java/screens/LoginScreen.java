package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class LoginScreen extends LayoutScreen {
    public LoginScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login / Sign up Form\")")
    private WebElement loginTitle;

    public void loaded() {
        super.waitElement(this.loginTitle);
    }
}
