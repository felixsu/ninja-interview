package co.ninjavan.interview.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class SeleniumImpl implements Selenium {

    private final WebDriver driver;

    public SeleniumImpl(WebDriver driver) {
        this.driver = driver;
    }

    @Override
    public void goToTab(int indexTab) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void click(WebElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void doubleClick(WebElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void fill(WebElement el, String stringValue) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void clearField(WebElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void waitUntilVisibilityOfElementLocated(WebElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void waitUntilInvisibilityOfElementLocated(WebElement el) {
        throw new UnsupportedOperationException();
    }

    @Override
    public void scrollDown() {
        throw new UnsupportedOperationException();
    }

    @Override
    public boolean isElementExist(WebElement el) {
        return false;
    }
}
