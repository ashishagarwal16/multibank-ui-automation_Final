package tests;

import org.testng.Assert;
import org.testng.annotations.*;
import pages.AboutPage;
import pages.HomePage;
import utils.WebDriverFactory;

public class ContentTest {

    private HomePage homePage;
    private AboutPage aboutPage;

    @Parameters({"browser"})
    @BeforeClass
    public void setup(String browser) {
        WebDriverFactory.initDriver(browser);
        homePage = new HomePage();
        aboutPage = new AboutPage();
    }

    @Test
    public void verifyAboutUsContent() {
        homePage.goTo();
        homePage.clickAboutUsMenu();
        Assert.assertTrue(aboutPage.isWhyMultiLinkVisible(), "Why MultiLink section should be visible");
    }

    @AfterClass
    public void teardown() {
        WebDriverFactory.quitDriver();
    }
}
