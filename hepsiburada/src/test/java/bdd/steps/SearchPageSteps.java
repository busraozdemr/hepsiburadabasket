package bdd.steps;

import bdd.page.ProductDetailPage;
import bdd.page.SearchPage;
import bdd.utils.StrongerDriver;
import bdd.utils.Windows;
import org.openqa.selenium.By;

import java.util.Random;

import static bdd.steps.productDetailPageSteps.firstStoreName;

public class SearchPageSteps extends StrongerDriver {

    SearchPage SearchPage;

    ProductDetailPage productDetailPage;

    Windows windows = new Windows();

    public void clickRandomProduct() {
        visibilityOfElement(SearchPage.PRODUCT_LIST);
        int productList = getDriver().findElements(SearchPage.PRODUCT_LIST).size();
        Random rn = new Random();
        int answer = rn.nextInt(productList) + 1;
        clickToBy(By.xpath("//*[@data-test-id='loader-false']//*[@id='i" + answer + "']/div/a"));
    }

    public void clickSecondProduct() {
        String secondStoreName = null;

        do {
            clickRandomProduct();
            openTheSecondProductDetailPage();
            secondStoreName = getDriver().findElement(ProductDetailPage.STORE_NAME_TEXT).getText();
            if (secondStoreName.equalsIgnoreCase(firstStoreName)) {
                closeProductDetailPage();
            }
        } while ((secondStoreName.equalsIgnoreCase(firstStoreName)));

    }

    public void openTheSecondProductDetailPage() {
        windows.switchPage(getDriver(), 2);
    }

    public void closeProductDetailPage() {
        windows.closePage(getDriver(), 2);
    }
}
