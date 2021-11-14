package bdd.steps;

import bdd.page.HomePage;
import bdd.utils.StrongerDriver;
import org.hamcrest.MatcherAssert;
import org.hamcrest.Matchers;

public class HomePageSteps extends StrongerDriver {

    HomePage HomePage;

    public void openTheHomepage() {
        HomePage.open();
    }

    public void hoverTheLoginButton() {
        hoverElement(HomePage.LOGIN_BUTTON);
    }

    public void clickLoginButton() {
        clickToBy(HomePage.SIGN_IN_BUTTON);
    }

    public String loginControl() {
        visibilityOfElement(HomePage.MY_ACCOUNT_TEXT);
        return getDriver().findElement(HomePage.MY_ACCOUNT_TEXT).getText();
    }

    public void shouldHaveLogin(String myAccount) {
        MatcherAssert.assertThat("User couldn't logged in!",
                loginControl(), Matchers.equalTo(myAccount));
    }

    public HomePageSteps typeSearchKeywordAs(String searchKeyword) {
        type(HomePage.SEARCH_TEXTBOX, searchKeyword, false);
        return this;
    }

    public void clickSearchButton() {
        clickToBy(HomePage.SEARCH_BUTTON);
    }
}
