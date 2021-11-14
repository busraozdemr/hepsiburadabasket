package bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

@DefaultUrl("page:webdriver.base.url")
public class HomePage extends PageObject {

    public static final By LOGIN_BUTTON = By.id("myAccount");
    public static final By SIGN_IN_BUTTON = By.id("login");
    public static final By MY_ACCOUNT_TEXT = By.xpath("//*[@title='Hesabım']/span[1]");
    public static final By SEARCH_TEXTBOX = By.xpath("//*[@class='desktopOldAutosuggestTheme-input']");
    public static final By SEARCH_BUTTON = By.xpath("//*[text()='ARA']");
}



