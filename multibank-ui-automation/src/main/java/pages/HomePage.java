package pages;

import org.openqa.selenium.By;

public class HomePage extends BasePage {

    private By topNavMenu = By.cssSelector("ul.top-nav");
    private By tradingMenuItem = By.linkText("Trading");
    private By aboutUsMenuItem = By.linkText("About Us");

    public void goTo() {
        driver.get("https://trade.multibank.io/");
    }

    public boolean isTopNavVisible() {
        return isVisible(topNavMenu);
    }

    public void clickTradingMenu() {
        click(tradingMenuItem);
    }

    public void clickAboutUsMenu() {
        click(aboutUsMenuItem);
    }
}
