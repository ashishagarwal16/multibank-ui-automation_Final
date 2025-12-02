package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import utils.WebDriverFactory;
import utils.WaitUtils;

public class BasePage {
    protected WebDriver driver;
    protected WaitUtils waitUtils;

    public BasePage() {
        this.driver = WebDriverFactory.getDriver();
        this.waitUtils = new WaitUtils(driver, 10);
    }

    protected void click(By locator) {
        waitUtils.waitForClickability(locator);
        driver.findElement(locator).click();
    }

    protected void type(By locator, String text) {
        waitUtils.waitForVisibility(locator);
        driver.findElement(locator).sendKeys(text);
    }

    protected String getText(By locator) {
        waitUtils.waitForVisibility(locator);
        return driver.findElement(locator).getText();
    }

    protected boolean isVisible(By locator) {
        try {
            waitUtils.waitForVisibility(locator);
            return driver.findElement(locator).isDisplayed();
        } catch (Exception e) {
            return false;
        }
    }
}
