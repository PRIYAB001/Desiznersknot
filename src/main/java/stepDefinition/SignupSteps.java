package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.When;
import org.junit.Assert;
import pages.BasePage;
import pages.signupPages;

public class SignupSteps {

    public SignupSteps() {
    }

    signupPages SP = new signupPages(BasePage.getDriver());

    @Given("Designer is on signup page")
    public void designer_is_on_signup_page() {
        SP.verifySignupPage();
    }

    @When("Designer enters the name in signup Page")
    public void designerEntersTheNameInSignupPage() {
        Assert.assertTrue("Name is not as same as Entered name", SP.enterName());
    }

    @And("Designer enters the mailid in signup page")
    public void designerEntersTheMailidInSignupPage() {
        Assert.assertTrue("Email id is not same as entered email id", SP.enterEmailID());
    }

    @And("Designer enters username and password in signup page")
    public void designerEntersUsernameAndPasswordInSignupPage() {
        Assert.assertTrue("username or password is not as same as entered username or password", SP.EnterUsernameAndPassword());
    }

    @And("Designer selects the profile in sign up page")
    public void designerSelectsTheProfileInSignUpPage() {
        SP.selectProfile();
    }

    @And("Designer accepts the terms and conditions in signup page")
    public void designerAcceptsTheTermsAndConditionsInSignupPage() {
        SP.clickOnTermsAndConditionCheckBox();
    }

    @And("click on signup button")
    public void clickOnSignupButton() {
        SP.clickOnSignUpButton();
    }
}
