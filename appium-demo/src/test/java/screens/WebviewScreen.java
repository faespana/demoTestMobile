package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class WebviewScreen extends LayoutScreen {
    public WebviewScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.view.View\").descriptionContains(\"Next-gen browser\")")
    private WebElement webviewTitle;

    public void loaded() {
        super.waitElement(this.webviewTitle);
    }
}
