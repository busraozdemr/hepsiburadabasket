package bdd.steps;

import bdd.page.LoginPage;
import bdd.utils.StrongerDriver;

import java.util.HashMap;
import java.util.Map;

public class LoginPageSteps extends StrongerDriver {

   LoginPage LoginPage;

    public Runnable loginFunction(String key, String value) {
        Map<String, Runnable> hashMap = new HashMap<>();
        hashMap.put("username", () -> fillUsername(value));
        hashMap.put("password", () -> fillPassword(value));
        return hashMap.get(key);
    }

    private void fillPassword(String password) {
        type(LoginPage.PASSWORD_TEXTBOX,password,false);
    }

    private void fillUsername(String username) {
        visibilityOfElement(LoginPage.USERNAME_TEXTBOX);
        type(LoginPage.USERNAME_TEXTBOX,username,false);
    }

    public void clickSubmitButton() {
        clickToBy(LoginPage.SUBMIT_BUTTON);
    }
}
