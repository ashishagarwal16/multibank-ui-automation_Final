package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import utils.WebDriverFactory;

public class NavigationTest {

    private HomePage homePage;

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser) {
        WebDriverFactory.initDriver(browser);
        homePage = new HomePage();
    }

    @Test
    public void testTopNavigationMenu() {
        homePage.goTo();
        Assert.assertTrue(homePage.isTopNavVisible(), "Top navigation menu should be visible");
    }

    @Test
    public void testNavigationToTrading() {
        homePage.goTo();
        homePage.clickTradingMenu();
        Assert.assertTrue(WebDriverFactory.getDriver().getCurrentUrl().contains("trading"));
    }

    @AfterClass
    public void teardown() {
        WebDriverFactory.quitDriver();
    }
}
