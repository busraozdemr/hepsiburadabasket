package bdd.stepdefinitions;

import bdd.steps.SearchPageSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class SearchPageStepDefinitions {

    @Steps
    SearchPageSteps searchpageSteps;

    @And("User click random product at the Search Page")
    public void userClickRandomProductAtTheSearchPage() {
        searchpageSteps.clickRandomProduct();
    }

    @And("User click second random product at the Search Page")
    public void userClickSecondRandomProductAtTheSearchPage() {
        searchpageSteps.clickSecondProduct();
    }

    @And("User open the second product detail page at the Search Page")
    public void userOpenTheSecondProductDetailPageAtTheSearchPage() {
        searchpageSteps.openTheSecondProductDetailPage();
    }
}
