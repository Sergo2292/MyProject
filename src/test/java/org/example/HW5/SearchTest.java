package org.example.HW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;


public class SearchTest extends AbstractTest {
    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    @Test
    @DisplayName("Тест-кейс №3: Поиск")
    public void search() {
        login();
        searchProduct();
        logout();
    }

    private static void login() {
        getWebDriver().findElement(By.cssSelector("#main_navigation > a")).click();
        getWebDriver().findElement(By.cssSelector("a.list-group-item")).click();
        getWebDriver().findElement(By.id("loginform-username")).sendKeys(LOGIN);
        getWebDriver().findElement(By.id("loginform-password")).sendKeys(PASSWORD);
        getWebDriver().findElement(By.cssSelector("#login-form > div.text-end.pt-3 > button")).click();
    }

    public static void searchProduct() {
        getWebDriver().findElement(By.cssSelector("form.search > input.form-control")).sendKeys("кантри");
        getWebDriver().findElement(By.cssSelector("form.search > button.btn")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(2) > .stretched-link")).click();
        getWebDriver().findElement(By.cssSelector(".quantity-block > button.btn-warning")).click();
        getWebDriver().findElement(By.cssSelector(".modal-footer > .d-flex > .col-md-6 > a")).click();
        getWebDriver().findElement(By.cssSelector("form.search > input.form-control")).sendKeys("бася");
        getWebDriver().findElement(By.cssSelector("form.search > button.btn")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(1) > .stretched-link")).click();
        getWebDriver().findElement(By.cssSelector(".quantity-block > button.btn-warning")).click();
        getWebDriver().findElement(By.cssSelector(".modal-footer > .d-flex > .col-md-6 > a")).click();
      /*  */
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №3 пройден");
    }

    public static void logout() {

        getWebDriver().findElement(By.cssSelector(".logo-link")).click();
        getWebDriver().findElement(By.cssSelector(".fa-sign-in-alt")).click();
        getWebDriver().quit();

    }
}
