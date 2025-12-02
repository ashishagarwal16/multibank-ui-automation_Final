package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.HomePage;
import pages.TradingPage;
import utils.WebDriverFactory;

public class TradingTest {
    private HomePage homePage;
    private TradingPage tradingPage;

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser) {
        WebDriverFactory.initDriver(browser);
        homePage = new HomePage();
        tradingPage = new TradingPage();
    }

    @Test
    public void verifyTradingPairs() {
        homePage.goTo();
        homePage.clickTradingMenu();
        Assert.assertTrue(tradingPage.isTradingPairsVisible(), "Trading pairs section should be visible");
    }

    @AfterClass
    public void teardown() {
        WebDriverFactory.quitDriver();
    }
}
