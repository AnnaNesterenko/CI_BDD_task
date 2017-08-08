package com.example.test;

import com.example.test.steps.HomePageSteps;
import com.example.test.steps.RoomPageSteps;
import net.serenitybdd.jbehave.SerenityStories;
import net.thucydides.core.annotations.Steps;
import org.jbehave.core.annotations.Given;
import org.jbehave.core.annotations.Then;
import org.jbehave.core.annotations.When;

/**
 * Created by macmini on 13/06/2017.
 */

public class DBDDTestAddNewPlace2Test extends SerenityStories {
    @Steps
    private HomePageSteps homePage;
    @Steps
    private RoomPageSteps roomSteps;


    @Given("the customer selects the location for adding new place")
    public void givenTheCustomerSelectsTheLocationForAddingNewPlace() {
        homePage.openHomePage();
        homePage.selectLocation();
    }

    @When("the customer requests adding new place")
    public void whenTheCustomerRequestsAddingNewPlace() {
        roomSteps.requestAddingNewPlace();
    }

    @When("the customer fills in all required fields for new place with number $placeNumber")
    public void whenTheCustomerFillsInAllRequiredFields(String placeNumber) {
        roomSteps.fillRequiredFieldsForNewPlaceWithNumber(placeNumber);
    }

    @When("the customer submits adding new place")
    public void whenTheCustomerSubmitsAddingNewPlace() {
        roomSteps.submitAddingNewPlace();
    }

    @Then("the customer should see the new place $placeNumber is added")
    public void thenTheCustomerShouldSeeTheNewPlaceIsAdded(String placeNumber) {
        roomSteps.verifyNewPlaceIsDisplayed(placeNumber);
    }
}
