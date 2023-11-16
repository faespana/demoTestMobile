package screens;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.bases.LayoutScreen;
import utils.MyAndroidDriver;

public class DragScreen extends LayoutScreen {
    public DragScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Drag and Drop\")")
    private WebElement dragTitle;

    public void loaded() {
        super.waitElement(this.dragTitle);
    }
}
