package pages;

import org.openqa.selenium.By;

public class TradingPage extends BasePage {
    private By tradingPairsSection = By.id("trading-pairs");

    public boolean isTradingPairsVisible() {
        return isVisible(tradingPairsSection);
    }
}
