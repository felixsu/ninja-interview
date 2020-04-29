package co.ninjavan.interview.api;

import io.appium.java_client.MobileElement;

public interface Appium {

    void goToActivity(String activityName);

    void click(MobileElement el);

    void sendKeys(MobileElement el, String stringValue);

    void sendKeysThenEnter(MobileElement el, String stringValue);

    void clearFieldThenSendKeys(MobileElement el, String stringValue);

    void waitUntilVisibilityOfElementLocated();

    void waitUntilInvisibilityOfElementLocated();

}
