package tests;

import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Parameters;

import utils.MyAndroidDriver;

public class BaseAndroidTest {
    protected MyAndroidDriver myAndroidDriver;

    @BeforeSuite
    @Parameters({ "appiumServerUrl" })
    public void beforeSuite(String appiumServerUrl) {
        this.myAndroidDriver = new MyAndroidDriver(appiumServerUrl);
    }

    @AfterSuite
    public void afterSuite() {
        this.myAndroidDriver.getDriver().quit();
    }
}
