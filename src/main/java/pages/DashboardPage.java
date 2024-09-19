package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class DashboardPage extends BaseClass{
    public DashboardPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Highlights')]")
    WebElement highlightsTxt;
    public boolean verifyDashboardPage() {
        highlightsTxt.isDisplayed();
        return true;
    }
}
