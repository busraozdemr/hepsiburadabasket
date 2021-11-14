package bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class ProductDetailPage extends PageObject {

    public static final By PRODUCT_NAME_TEXT = By.id("product-name");
    public static final By STORE_NAME_TEXT = By.xpath("//*[@class='seller']//a");
    public static final By ADD_TO_BASKET_BUTTON = By.id("addToCart");
    public static final By MY_BASKET_BUTTON =By.xpath("//button[text()='Sepete git']");
    public static final By KEEP_SHOPPING_BUTTON = By.xpath("//button[text()='Alışverişe devam et']");
    public static final By MY_BASKET_WITHOUT_LOGIN_BUTTON = By.xpath("//*[contains(@href,'sepetim')]");
}



