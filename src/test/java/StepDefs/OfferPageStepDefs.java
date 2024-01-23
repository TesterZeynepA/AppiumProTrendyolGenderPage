package StepDefs;

import Pages.OfferPage;
import Utils.DriverFactory;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class OfferPageStepDefs {

    OfferPage op = new OfferPage(DriverFactory.getDriver());

    @Then("should see Offer Page")
    public void shouldSeeOfferPage() {
        op.checkOfferPage();
    }

}
