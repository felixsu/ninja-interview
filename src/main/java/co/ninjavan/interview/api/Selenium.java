package co.ninjavan.interview.api;

import org.openqa.selenium.WebElement;

public interface Selenium {

    /**
     * this method is to change active tab
     * @param indexTab Tab index, start with 0
     */
    void goToTab(int indexTab);

    /**
     * this method is to click given WebElement
     * @param el WebElement
     */
    void click(WebElement el);

    /**
     * this method is to double click given WebElement
     * @param el WebElement
     */
    void doubleClick(WebElement el);

    /**
     * type string into the element
     * @param el WebElement
     * @param stringValue string to be typed into the input element
     */
    void fill(WebElement el, String stringValue);

    /**
     * clear any string on field element
     * @param el WebElement
     */
    void clearField(WebElement el);

    /**
     * finish the block until element's visibility is true
     * @param el WebElement
     */
    void waitUntilVisibilityOfElementLocated(WebElement el);

    /**
     * finish the block until element's visibility is false
     * @param el WebElement
     */
    void waitUntilInvisibilityOfElementLocated(WebElement el);

    /**
     * scroll down until the end of page
     */
    void scrollDown();

    /**
     * check if the given element exist on page
     * @param el WebElement that'll be checked
     * @return true if element present on page. false if element is not present
     */
    boolean isElementExist(WebElement el);
}
