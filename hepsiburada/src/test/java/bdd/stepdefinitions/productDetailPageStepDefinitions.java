package bdd.stepdefinitions;

import bdd.steps.productDetailPageSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

public class productDetailPageStepDefinitions {

    @Steps
    productDetailPageSteps productDetailPageSteps;

    @And("User open the product detail page at the Product Detail Page")
    public void userOpenTheProductDetailPageAtTheProductDetailPage() {
        productDetailPageSteps.openTheProductDetailPage();
    }

    @And("User get product info at the Product Detail Page")
    public void userGetProductInfoAtTheProductDetailPage() {
        productDetailPageSteps.getInfoProductName().getStoreName();
    }

    @And("User click add to basket at the Product Detail Page")
    public void userClickAddToBasketAtTheProductDetailPage() {
        productDetailPageSteps.addToBasket();
    }

    @And("User close the product detail page at the Product Detail Page")
    public void userCloseTheProductDetailPageAtTheProductDetailPage() {
        productDetailPageSteps.closeTheProductDetailPage();
    }

    @And("User click my basket button at the Product Detail Page")
    public void userClickMyBasketButtonAtTheProductDetailPage() {
        productDetailPageSteps.clickMyBasketButton();
    }

    @And("User click keep shopping button at the Product Detail Page")
    public void userClickKeepShoppingButtonAtTheProductDetailPage() {
        productDetailPageSteps.clickKeepShoppingButton();
    }

    @And("User get second product detail info at the Search Page")
    public void userGetSecondProductDetailInfoAtTheSearchPage() {
        productDetailPageSteps.getSecondProductName().getSecondStoreName();
    }

    @And("User click my basket button without login at the Product Detail Page")
    public void userClickMyBasketButtonWithoutLoginAtTheProductDetailPage() {
        productDetailPageSteps.clickMyBasketWithoutLogin();
    }
}
