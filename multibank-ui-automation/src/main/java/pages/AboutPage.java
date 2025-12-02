package pages;

import org.openqa.selenium.By;

public class AboutPage extends BasePage {
    private By whyMultiLinkSection = By.id("why-multilink");

    public boolean isWhyMultiLinkVisible() {
        return isVisible(whyMultiLinkSection);
    }
}
