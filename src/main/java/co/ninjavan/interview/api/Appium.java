package co.ninjavan.interview.api;

import io.appium.java_client.MobileElement;

public interface Appium {

    void goToActivity(String activityName);

    /**
     * perform click action to the element
     * @param el any element
     */
    void click(MobileElement el);

    /**
     * type string into the element
     * @param el input element
     * @param stringValue string to be typed into the input element
     */
    void sendKeys(MobileElement el, String stringValue);

    /**
     * @see #sendKeys(MobileElement, String)
     * but press new line key after it finished the string input
     * @param el input element
     * @param stringValue string to be typed into the input element
     */
    void sendKeysThenEnter(MobileElement el, String stringValue);

    /**
     * @see #sendKeys(MobileElement, String)
     * but with clear the input element in before perform any input
     * @param el input element
     * @param stringValue string to be typed into the input element
     */
    void clearFieldThenSendKeys(MobileElement el, String stringValue);

    /**
     * finish the block until element is visibility is true
     * @param el input element
     */
    void waitUntilVisibilityOfElementLocated(MobileElement el);

    /**
     * finish the block until element is visibility is false
     * @param el input element
     */
    void waitUntilInvisibilityOfElementLocated(MobileElement el);

}
