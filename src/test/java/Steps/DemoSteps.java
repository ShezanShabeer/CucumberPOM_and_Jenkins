package Steps;

import Pages.HomePage;
import Pages.LoginPage;
import Utils.ConfigReader;
import WebdriverFactory.DriverFactory;
import io.cucumber.java.en.*;
import org.junit.Assert;

public class DemoSteps {

    private ConfigReader configReader = new ConfigReader();
    private LoginPage loginPage = new LoginPage(DriverFactory.getDriver());
    private HomePage homePage = new HomePage(DriverFactory.getDriver());

    @Given("the user launches NOP Admin url")
    public void the_user_launches_nop_admin_url() {
        DriverFactory.getDriver().get(configReader.getConfig("url"));
    }
    @Then("the user verifies the header text")
    public void the_user_verifies_the_header_text() {
        Assert.assertTrue(loginPage.isHeaderDisplayed());
    }
    @When("the user enters {string} in the username webEdit")
    public void the_user_enters_in_the_username_web_edit(String user) {
        loginPage.enterUsername(user);
    }
    @When("the user enters {string} in the password webEdit")
    public void the_user_enters_in_the_password_web_edit(String pass) {
        loginPage.enterPassword(pass);
    }
    @When("the user clicks on the login button")
    public void the_user_clicks_on_the_login_button() {
        loginPage.clickLogin();
    }
    @Then("the user verifies the homepage logo")
    public void the_user_verifies_the_homepage_logo() {
        Assert.assertTrue(homePage.isHomePageDisplayed());
    }
    @Then("the user clicks on logout button")
    public void the_user_clicks_on_logout_button() {
        homePage.clickLogout();
    }

    @Then("the user verifies page is displaying incorrect credentials")
    public void theUserVerifiesPageIsDisplayingIncorrectCredentials() {
        loginPage.isLoginFailDisplayed();
    }
}
