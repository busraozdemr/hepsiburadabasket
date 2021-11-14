package bdd.steps;

import bdd.page.MyBasketPage;
import bdd.utils.StrongerDriver;
import org.openqa.selenium.By;

import static bdd.steps.productDetailPageSteps.*;
import static org.junit.Assert.*;

public class MyBasketSteps extends StrongerDriver {

    MyBasketPage myBasketPage;

    public void shouldHaveTwoProducts() {

        assertTrue("first product not found",
                getDriver().findElement(By.xpath("//*[text()='" + firstProductName + "']")).isEnabled());

        assertTrue("second product not found",
                getDriver().findElement(By.xpath("//*[text()='" + secondProductName + "']")).isEnabled());

    }
}
