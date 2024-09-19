package stepDefinition;

import io.cucumber.java.en.And;
import org.junit.Assert;
import pages.BasePage;
import pages.DashboardPage;

public class DashboardSteps {

    DashboardPage DP = new DashboardPage(BasePage.getDriver());

    @And("verify user is redirected to dashboard page")
    public void verifyUserIsRedirectedToDashboardPage() {
        Assert.assertTrue("user is not redirested to dashboard", DP.verifyDashboardPage());
    }
}