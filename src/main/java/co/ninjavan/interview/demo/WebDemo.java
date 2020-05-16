package co.ninjavan.interview.demo;

import co.ninjavan.interview.api.SeleniumImpl;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

/**
 * Objective:
 * Open the page http://tbd.com,  use created
 * {@link co.ninjavan.interview.api.Selenium} and do
 * - action 1
 * - action 2
 */
public class WebDemo {

    public static void main(String[] args) {
        System.out.println("Run Web Demo");

    }

    @Test(dataProvider = "pageObjects")
    public void textFieldVerification(final SeleniumImpl seleniumImpl) throws Exception {
        String textValueToFind = "Hi";

        seleniumImpl.init(driver);
        seleniumImpl.clearField();
        seleniumImpl.fill(textValueToFind);
    }

    private WebDriver driver;

    @BeforeMethod
    public void initSelenium() throws Exception {
        System.setProperty("webdriver.chrome.driver",
                "C:\\Users\\Administrator\\Desktop\\chromedriver\\chromedriver.exe");
        driver = new ChromeDriver();
        driver.get("https://www.google.com");
    }

    @AfterMethod
    public void q() {
        driver.quit();
    }

    @DataProvider
    private Object[][] pageObjects() {
        return new Object[][]{
                {
                        new SeleniumImpl()
                }
        };
    }

}
