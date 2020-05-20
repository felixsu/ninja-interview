package co.ninjavan.interview.demo;

import co.ninjavan.interview.api.AppiumImpl;
import io.appium.java_client.android.AndroidDriver;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;
import io.appium.java_client.remote.MobileCapabilityType;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.testng.annotations.DataProvider;

import java.net.MalformedURLException;
import java.net.URL;

public class AppiumDemo {

    @Test(dataProvider = "pageObjects")
    public void testCase(final AppiumImpl appiumImpl) throws InterruptedException {

        String textValueToFind = "Hi";

        appiumImpl.sendKeys(androidDriver.findElementById("search_src_text"), textValueToFind);
    }

    private AndroidDriver<AndroidElement> androidDriver;

    @BeforeMethod
    public void initSelenium() throws MalformedURLException, InterruptedException {
        DesiredCapabilities caps = new DesiredCapabilities();

        caps.setCapability(MobileCapabilityType.PLATFORM_NAME, "Android");
        caps.setCapability(MobileCapabilityType.DEVICE_NAME, "Samsung");
        caps.setCapability(MobileCapabilityType.APP,
                "C:\\Users\\Administrator\\Desktop\\functional-0.3.2.apk");

        androidDriver = new AndroidDriver<AndroidElement>(new URL("http://0.0.0.0:4723/wd/hub"),
                caps);
    }

    @AfterMethod
    public void q() {
        androidDriver.quit();
    }

    @DataProvider
    private Object[][] pageObjects() {
        return new Object[][]{
                {
                        new AppiumImpl()
                }
        };
    }
}
