package pages;

import com.github.javafaker.Faker;
import io.cucumber.java.After;
import io.cucumber.java.Before;
import org.apache.commons.lang3.RandomStringUtils;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class BasePage {
    public static WebDriver driver;


    @Before
    public void setup() {
        driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.get("https://dezinersknot-460842-react.b460842.uat.eastus.az.svc.builder.ai/");
        driver.manage().window().maximize();
    }

    public static WebDriver getDriver() {
        return driver;
    }

    @After
    public void quit() {
        driver.quit();
    }


    public static void explicitWait(WebElement element) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        wait.until(ExpectedConditions.visibilityOf(element));
    }

    public static String generateName() {
        Faker faker = new Faker();
        String name = faker.name().fullName();
        int length = 6;
        boolean useLetters = true;
        boolean useNumbers = false;
        String generatedName = RandomStringUtils.random(length, useLetters, useNumbers);
        return name;
    }

    public static String randomEmail() {
        String str = RandomStringUtils.randomAlphabetic(6);
        String num = RandomStringUtils.randomNumeric(2);
        return (str + num + "@gmail.com");
    }

    public static String randomUserName() {
        String str = RandomStringUtils.randomAlphabetic(6);
        String num = RandomStringUtils.randomNumeric(3);
        return (str + num);
    }

    public static String randomName() {
        String str = RandomStringUtils.randomAlphabetic(6);
        return str;
    }
}
