package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class HomeScreen extends LayoutScreen {
    public HomeScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"WEBDRIVER\")")
    private WebElement homeTitle;

    public void loaded() {
        super.waitElement(this.homeTitle);
    }
}
