package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

import screens.DragScreen;
import screens.FormsScreen;
import screens.HomeScreen;
import screens.LoginScreen;
import screens.WebviewScreen;
import screens.SwipeScreen;

public class WdioDemoAppTests extends BaseAndroidTest {
    private HomeScreen homeScreen;

    @BeforeClass
    public void beforeClass() {
        this.homeScreen = new HomeScreen(super.myAndroidDriver);
        this.homeScreen.loaded();
    }

    @Test
    public void bottomBarNavigationTest() {
        WebviewScreen webviewScreen = this.homeScreen.touchWebviewButton();
        webviewScreen.loaded();

        LoginScreen loginScreen = webviewScreen.touchLoginButton();
        loginScreen.loaded();

        FormsScreen formsScreen = loginScreen.touchFormsButton();
        Assert.assertEquals(formsScreen.getTitleText(), "Form components");

        SwipeScreen swipeScreen = formsScreen.touchSwipeButton();
        swipeScreen.loaded();

        DragScreen dragScreen = swipeScreen.touchDragButton();
        dragScreen.loaded();

        this.homeScreen = dragScreen.touchHomeButton();
        this.homeScreen.loaded();
    }

    @Test
    public void succesfulSignUpTest() {
        this.homeScreen.touchHomeButton();
        this.homeScreen.loaded();
    }
}
