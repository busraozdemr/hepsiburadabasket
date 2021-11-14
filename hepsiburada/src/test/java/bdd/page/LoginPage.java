package bdd.page;

import net.serenitybdd.core.pages.PageObject;
import net.thucydides.core.annotations.DefaultUrl;
import org.openqa.selenium.By;

public class LoginPage extends PageObject {

    public static final By USERNAME_TEXTBOX = By.id("txtUserName");
    public static final By PASSWORD_TEXTBOX = By.id("txtPassword");
    public static final By SUBMIT_BUTTON = By.id("btnLogin");
}



