package utils;

import java.net.URL;
import java.time.Duration;

import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.support.ui.WebDriverWait;

import io.appium.java_client.android.AndroidDriver;
import io.github.cdimascio.dotenv.Dotenv;

public class MyAndroidDriver {
    private AndroidDriver driver;
    private WebDriverWait wait;

    private Dotenv dotenv;

    public MyAndroidDriver(String appiumServerUrl) {
        this.dotenv = Dotenv.load();
        createDriver(appiumServerUrl);
    }

    private void createDriver(String appiumServerUrl) {
        try {
            DesiredCapabilities capabilities = setUpCapabilities();

            this.driver = new AndroidDriver(new URL(appiumServerUrl), capabilities);
            this.wait = new WebDriverWait(this.driver, Duration.ofSeconds(10));
        } catch (Exception e) {
            System.out.println("FAILED TO CREATE DRIVER");
            System.out.println(e.getMessage());
        }
    }

    private DesiredCapabilities setUpCapabilities() {
        DesiredCapabilities capabilities = new DesiredCapabilities();

        capabilities.setCapability("deviceName", this.dotenv.get("DEVICE_NAME"));
        capabilities.setCapability("platformName", this.dotenv.get("PLATFORM_NAME"));
        capabilities.setCapability("appVersion", this.dotenv.get("APP_VERSION"));
        capabilities.setCapability("appPackage", this.dotenv.get("APP_PACKAGE"));
        capabilities.setCapability("appActivity", this.dotenv.get("APP_ACTIVITY"));
        capabilities.setCapability("app", this.dotenv.get("APP_PATH"));
        capabilities.setCapability("automationName", this.dotenv.get("AUTOMATION_NAME"));
        capabilities.setCapability("appWaitActivity", this.dotenv.get("APP_WAIT_ACTIVITY"));

        return capabilities;
    }

    public AndroidDriver getDriver() {
        return this.driver;
    }

    public WebDriverWait getWait() {
        return this.wait;
    }
}
