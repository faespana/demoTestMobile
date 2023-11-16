package screens.bases;

import org.openqa.selenium.WebElement;

import io.appium.java_client.pagefactory.AndroidFindBy;
import screens.DragScreen;
import screens.FormsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.SwipeScreen;
import screens.WebviewScreen;
import screens.parts.BottomMenuBar;
import utils.MyAndroidDriver;

public class LayoutScreen extends BaseScreen implements BottomMenuBar {
    public LayoutScreen(MyAndroidDriver myAndroidDriver) {
        super(myAndroidDriver);
    }

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Home\")")
    private WebElement homeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Webview\")")
    private WebElement webviewButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Login\")")
    private WebElement loginButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Forms\")")
    private WebElement formsButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Swipe\")")
    private WebElement swipeButton;

    @AndroidFindBy(uiAutomator = "new UiSelector().className(\"android.widget.TextView\").text(\"Drag\")")
    private WebElement dragButton;

    @Override
    public HomeScreen touchHomeButton() {
        super.touchOnElement(this.homeButton);
        return new HomeScreen(super.myAndroidDriver);
    }

    @Override
    public WebviewScreen touchWebviewButton() {
        super.touchOnElement(this.webviewButton);
        return new WebviewScreen(super.myAndroidDriver);
    }

    @Override
    public LoginScreen touchLoginButton() {
        super.touchOnElement(this.loginButton);
        return new LoginScreen(super.myAndroidDriver);
    }

    @Override
    public FormsScreen touchFormsButton() {
        super.touchOnElement(this.formsButton);
        return new FormsScreen(super.myAndroidDriver);
    }

    @Override
    public SwipeScreen touchSwipeButton() {
        super.touchOnElement(this.swipeButton);
        return new SwipeScreen(super.myAndroidDriver);
    }

    @Override
    public DragScreen touchDragButton() {
        super.touchOnElement(this.dragButton);
        return new DragScreen(super.myAndroidDriver);
    }
}
