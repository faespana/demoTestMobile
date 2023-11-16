package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class SwipeScreen extends LayoutScreen {
    public SwipeScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Swipe horizontal\")")
    private WebElement swipeTitle;

    public void loaded() {
        super.waitElement(this.swipeTitle);
    }
}
