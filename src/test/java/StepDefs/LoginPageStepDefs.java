package StepDefs;

import Pages.LoginPage;
import Utils.DriverFactory;
import io.appium.java_client.android.AndroidDriver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LoginPageStepDefs {
    LoginPage lp = new LoginPage(DriverFactory.getDriver());
    @Given("user is on the Login Page")
    public void userIsOnTheLoginPage() {

        lp.checkSignInButton();

    }

    @When("click Button on Login Page")
    public void clickButtonOnLoginPage() {
        lp.clickLoginButton();
    }

    @Then("should see Image on Login Page")
    public void shouldSeeImageOnLoginPage() {
        lp.checkImage();
    }
}
