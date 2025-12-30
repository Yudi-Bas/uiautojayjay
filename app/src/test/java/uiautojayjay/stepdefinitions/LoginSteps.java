package uiautojayjay.stepdefinitions;

import io.cucumber.java.en.*;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import uiautojayjay.pages.LoginPage;
import io.github.bonigarcia.wdm.WebDriverManager;

public class LoginSteps {

    private WebDriver driver;
    private LoginPage loginPage;

    @Given("user is on login page")
    public void userIsOnLoginPage() {
        WebDriverManager.chromedriver().setup();
        driver = new ChromeDriver();
        driver.get("https://www.saucedemo.com/");
        loginPage = new LoginPage(driver);
    }

    @When("user enters username {string} and password {string}")
    public void userEntersUsernameAndPassword(String username, String password) {
        loginPage.enterUsername(username);
        loginPage.enterPassword(password);
    }

    @When("clicks login")
    public void clicksLogin() {
        loginPage.clickLogin();
    }

    @Then("user should be logged in successfully")
    public void userShouldBeLoggedInSuccessfully() {
        // Contoh: cek URL dashboard
        if (!driver.getCurrentUrl().contains("inventory")) {
            throw new AssertionError("Login failed!");
        }
        driver.quit();
    }

    @Then("user should see an error message")
    public void userShouldSeeErrorMessage() {
        // Contoh: cek pesan error
        if (!driver.getPageSource().contains("Epic sadface")) {
            throw new AssertionError("Error message not displayed!");
        }
        driver.quit();
    }
}
