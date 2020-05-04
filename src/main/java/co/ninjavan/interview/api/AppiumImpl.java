package co.ninjavan.interview.api;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;

public class AppiumImpl implements Appium {

    private final AndroidDriver<WebElement> androidDriver;

    public AppiumImpl(AndroidDriver<WebElement> androidDriver) {
        this.androidDriver = androidDriver;
    }

    @Override
    public void goToActivity(String activityName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void click(MobileElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendKeys(MobileElement el, String stringValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void sendKeysThenEnter(MobileElement el, String stringValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearFieldThenSendKeys(MobileElement el, String stringValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void waitUntilVisibilityOfElementLocated(MobileElement el) {

    }

    @Override
    public void waitUntilInvisibilityOfElementLocated(MobileElement el) {

    }

}
