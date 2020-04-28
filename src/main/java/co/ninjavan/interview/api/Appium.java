package co.ninjavan.interview.api;

import io.appium.java_client.MobileElement;

public interface Appium {

    void goToActivity(String activityName);

    void click(MobileElement el);

}
