package bdd.steps;

import bdd.page.ProductDetailPage;
import bdd.utils.StrongerDriver;
import bdd.utils.Windows;

public class productDetailPageSteps extends StrongerDriver {

    ProductDetailPage productDetailPage;

    public static String firstProductName,secondProductName;

    public static String firstStoreName,secondStoreName;

    Windows windows = new Windows();

    public void openTheProductDetailPage() {
        windows.switchPage(getDriver(), 1);
    }

    public productDetailPageSteps getInfoProductName() {
        waitForPageToCompleteState(getDriver());
        firstProductName = getDriver().findElement(ProductDetailPage.PRODUCT_NAME_TEXT).getText();
        return this;
    }


    public void getStoreName() {
        firstStoreName = getDriver().findElement(ProductDetailPage.STORE_NAME_TEXT).getText();
    }

    public void addToBasket() {
        clickToBy(ProductDetailPage.ADD_TO_BASKET_BUTTON);
    }

    public void closeTheProductDetailPage() {
        windows.closePage(getDriver(), 1);
    }

    public void clickMyBasketButton() {
        visibilityOfElement(ProductDetailPage.MY_BASKET_BUTTON);
        clickToBy(ProductDetailPage.MY_BASKET_BUTTON);
    }

    public void clickKeepShoppingButton() {
        visibilityOfElement(ProductDetailPage.KEEP_SHOPPING_BUTTON);
        clickToBy(ProductDetailPage.KEEP_SHOPPING_BUTTON);
    }

    public productDetailPageSteps getSecondProductName() {
        waitForPageToCompleteState(getDriver());
        secondProductName = getDriver().findElement(ProductDetailPage.PRODUCT_NAME_TEXT).getText();
        return this;
    }

    public void getSecondStoreName() {
        secondStoreName = getDriver().findElement(ProductDetailPage.STORE_NAME_TEXT).getText();
    }

    public void clickMyBasketWithoutLogin() {
        clickToBy(ProductDetailPage.MY_BASKET_WITHOUT_LOGIN_BUTTON);
    }
}
