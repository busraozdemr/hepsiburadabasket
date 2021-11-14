package bdd.stepdefinitions;

import bdd.steps.LoginPageSteps;
import io.cucumber.java.en.And;
import net.thucydides.core.annotations.Steps;

import java.util.List;
import java.util.Map;

public class LoginPageStepDefinitions {

    @Steps
    LoginPageSteps loginpageSteps;

    @And("User type login info at the Login Page")
    public void userTypeLoginInfoAtTheLoginPage(List<Map<String, String>> loginList) {
        Map<String, String> loginParameters = loginList.get(0);
        for (Map.Entry<String, String> entry : loginParameters.entrySet()) {
            loginpageSteps.loginFunction(entry.getKey(), entry.getValue()).run();
        }
        loginpageSteps.clickSubmitButton();
    }
}
