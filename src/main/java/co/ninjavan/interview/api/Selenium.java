package co.ninjavan.interview.api;

import org.openqa.selenium.WebElement;

public interface Selenium {

    void goToTab(String tabName);

    void click(WebElement el);
}
