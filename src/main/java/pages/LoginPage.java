package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends BaseClass {


    public LoginPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Welcome back')]")
    WebElement welcomeBackTxt;

    public boolean verifyLoginPage(){
        welcomeBackTxt.isDisplayed();
        return true;
    }
}
