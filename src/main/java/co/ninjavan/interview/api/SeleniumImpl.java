package co.ninjavan.interview.api;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SeleniumImpl implements Selenium {

    @FindBy(xpath = "//input[@name='q']")
    private static WebElement searchField;

    @Override
    public void init(final WebDriver selenium) {
        PageFactory.initElements(selenium, this);
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
    public void fill(WebElement el, String stringValue) throws Exception {

        try {
            searchField.sendKeys(stringValue);
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("The input field was not found", e);
        }
    }

    @Override
    public void clearField(WebElement el) {

        try {
            searchField.clear();
        }
        catch(Exception e) {
            e.printStackTrace();
            throw new Exception("The input field was not found", e);
        }

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
