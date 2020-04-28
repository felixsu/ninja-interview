package co.ninjavan.interview.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumImpl implements Selenium {

    private final WebDriver driver;

    public SeleniumImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void goToTab(String tabName) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void click(WebElement el) {
        throw new UnsupportedOperationException();
    }

}
