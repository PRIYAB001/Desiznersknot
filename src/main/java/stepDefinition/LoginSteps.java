package stepDefinition;

import io.cucumber.java.en.Given;
import org.openqa.selenium.WebDriver;
import pages.BaseClass;
import pages.LoginPage;

public class LoginSteps extends BaseClass {

    public LoginSteps(WebDriver driver) {
        super(driver);
    }

    static LoginPage LP = new LoginPage(driver);

    @Given("Designer is on Login page")
    public static void designerIsOnLoginPage() {
        LP.verifyLoginPage();

    }
}

