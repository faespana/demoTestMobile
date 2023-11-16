package screens.bases;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;

import io.appium.java_client.pagefactory.AppiumFieldDecorator;
import utils.MyAndroidDriver;

public class BaseScreen {
    protected MyAndroidDriver myAndroidDriver;

    public BaseScreen(MyAndroidDriver myAndroidDriver) {
        this.myAndroidDriver = myAndroidDriver;
        PageFactory.initElements(new AppiumFieldDecorator(myAndroidDriver.getDriver()), this);
    }

    protected void touchOnElement(WebElement element) {
        this.myAndroidDriver.getWait().until(ExpectedConditions.visibilityOf(element));
        element.click();
    }

    protected void waitElement(WebElement element) {
        this.myAndroidDriver.getWait().until(ExpectedConditions.visibilityOf(element));
    }
}
