package bdd.stepdefinitions;

import bdd.steps.HomePageSteps;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class HomePageStepDefinitions {

    @Steps
    HomePageSteps homepageSteps;

    @Given("User open the Homepage")
    public void userOpenTheHomepage() {
        homepageSteps.openTheHomepage();
    }

    @And("User hover the Login Button at the HomePage")
    public void userHoverTheLoginButtonAtTheHomePage() {
        homepageSteps.hoverTheLoginButton();
    }

    @And("User click the Login Button at the Homepage")
    public void userClickTheLoginButtonAtTheHomepage() {
        homepageSteps.clickLoginButton();
    }

    @Then("User should have login text as {string} at the HomePage")
    public void userShouldHaveLoginTextAsAtTheHomePage(String myAccount) {
        homepageSteps.shouldHaveLogin(myAccount);
    }

    @And("User search with {string} at the HomePage")
    public void userSearchWithAtTheHomePage(String searchKeyword) {
        homepageSteps.typeSearchKeywordAs(searchKeyword)
        .clickSearchButton();
    }
}
