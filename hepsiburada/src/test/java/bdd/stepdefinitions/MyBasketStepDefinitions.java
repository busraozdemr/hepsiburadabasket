package bdd.stepdefinitions;

import bdd.steps.MyBasketSteps;
import io.cucumber.java.en.Then;
import net.thucydides.core.annotations.Steps;

public class MyBasketStepDefinitions {

    @Steps
    MyBasketSteps myBasketSteps;

    @Then("User should have two product at the My Basket Page")
    public void userShouldHaveTwoProductAtTheMyBasketPage() {
        myBasketSteps.shouldHaveTwoProducts();
    }
}
