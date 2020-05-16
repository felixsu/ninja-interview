package co.ninjavan.interview.api;

import io.appium.java_client.MobileElement;
import io.appium.java_client.android.AndroidDriver;
import org.openqa.selenium.WebElement;
import io.appium.java_client.android.AndroidElement;
import io.appium.java_client.android.nativekey.AndroidKey;
import io.appium.java_client.android.nativekey.KeyEvent;

public class AppiumImpl implements Appium {

    private AndroidDriver<WebElement> androidDriver;

    public AppiumImpl(final AndroidDriver<AndroidElement> androidDriver) {
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

        el.sendKeys(stringValue);

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
        throw new UnsupportedOperationException();
    }

    @Override
    public void waitUntilInvisibilityOfElementLocated(MobileElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scrollUntilTextFound(String text) {
        throw new UnsupportedOperationException();
    }

}
