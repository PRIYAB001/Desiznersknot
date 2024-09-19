package stepDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import org.junit.Assert;
import pages.BasePage;
import pages.CreateProfilePage;

public class CreateProfileSteps {

    CreateProfilePage CPP = new CreateProfilePage(BasePage.getDriver());

    @And("user add a profile image in create profile page")
    public void userAddAProfileImageInCreateProfilePage() throws InterruptedException {
        CPP.AddProfileImage();
    }

    @Then("verify user is redirected to create profile page")
    public void verifyUserIsRedirectedToLocationPage() throws InterruptedException {
        Assert.assertTrue("Designer is not redirected to Create profile page", CPP.verifyCreateProfilePage());
    }


    @And("user enters the location as {string} in create profile page")
    public void userEntersTheLocationAsInCreateProfilePage(String location) throws InterruptedException {
        CPP.enterLocation(location);

    }

    @And("user click on done button in create profile page")
    public void userClickOnDoneButtonInCreateProfilePage() {
        CPP.clickOnDoneButton();
    }
}
