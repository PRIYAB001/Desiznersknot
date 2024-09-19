package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import java.util.List;

public class CreateProfilePage extends BaseClass {
    public CreateProfilePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "//*[contains(text(),'Create profile')]")
    WebElement createProfileTxt;

    @FindBy(xpath = "//*[contains(@data-test-id,\"toggleAvatar\")]")
    List<WebElement> addImageicon;

    @FindBy(xpath = "//*[@class=\"MuiInputBase-input MuiOutlinedInput-input placeAutoComplete\"]")
    WebElement locationTxtBox;

    @FindBy(xpath = "//*[@data-test-id=\"location-description\"]//child::div")
    List<WebElement> suggestedLocations;

    @FindBy(xpath = "//*[contains(text(),'Done')]")
    WebElement doneBtn;

    public boolean verifyCreateProfilePage() throws InterruptedException {
        createProfileTxt.isDisplayed();
        return true;
    }


    public void AddProfileImage() {
        addImageicon.get(0).click();

    }

    public void enterLocation(String location) throws InterruptedException {
        locationTxtBox.click();
        locationTxtBox.sendKeys(location);
        for (int i = 0; i < suggestedLocations.size(); i++) {
            BasePage.explicitWait(suggestedLocations.get(i));
            System.out.println(suggestedLocations.get(i).isDisplayed());
            if (suggestedLocations.get(i).getText().contains(location)) {
                suggestedLocations.get(i).click();
            }
        }
    }

    public void clickOnDoneButton() {
        BasePage.explicitWait(doneBtn);
        doneBtn.click();
    }
}
