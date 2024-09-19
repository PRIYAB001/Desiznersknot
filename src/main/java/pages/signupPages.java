package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.sql.SQLOutput;

public class signupPages extends BaseClass {
    public signupPages(WebDriver driver) {
        super(driver);
    }

    String name;
    String userName;
    String emailid;
    @FindBy(xpath = "//*[contains(text(),'Join us')]")
    WebElement joinUsTxt;

    @FindBy(xpath = "//*[(@name='name')]")
    WebElement nameTextBox;

    @FindBy(xpath = "//*[(@name='username')]")
    WebElement userNameTxtBox;

    @FindBy(xpath = "//*[(@name='password')]")
    WebElement passwordTxtBox;

    @FindBy(xpath="//*[(@name='email')]")
    WebElement emailTxtBox;

    @FindBy(xpath="//*[(@value='designer')]")
    WebElement profileOption;

    @FindBy(xpath = "//*[@data-test-id=\"customCheckbox\"]")
    WebElement termsAndConditionCheckBox;

    @FindBy(xpath = "//*[@type=\"submit\"]")
    WebElement signupButton;


    public boolean verifySignupPage() {
        joinUsTxt.isDisplayed();
        return true;
    }

    public boolean enterName() {
        name = BasePage.randomName();
        nameTextBox.sendKeys(name);
        String name1 = nameTextBox.getAttribute("value");
        System.out.println(name);
        if (name.equals(name1)) {
            return true;
        }
        return false;
    }





    public boolean EnterUsernameAndPassword() {
        userName = BasePage.randomUserName();
        userNameTxtBox.sendKeys(userName);
        System.out.println(userName);
        String userName1=userNameTxtBox.getAttribute("value");
        passwordTxtBox.sendKeys("Priya*123");
        if(userName1.equals(userName)){
            return true;
        }
       return false;
    }

    public boolean enterEmailID() {
        emailid=BasePage.randomEmail();
        emailTxtBox.sendKeys(emailid);
        System.out.println(emailid);
        String emailid1=emailTxtBox.getAttribute("value");
        if (emailid.equals(emailid1)) {
            return true;
        }
        return false;
    }

    public void selectProfile() {
        profileOption.click();
    }

    public void clickOnTermsAndConditionCheckBox() {
        BasePage.explicitWait(termsAndConditionCheckBox);
        termsAndConditionCheckBox.click();
    }

    public void clickOnSignUpButton() {
        signupButton.click();
    }


}
