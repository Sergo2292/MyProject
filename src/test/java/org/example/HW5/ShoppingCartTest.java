package org.example.HW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ShoppingCartTest extends AbstractTest {
    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    @Test
    @DisplayName("Тест-кейс №2: Корзина")
    public void shoppingCart() {
        login();
        addShoppingCart();
        openCart();
        delShoppingCart();
        logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №2 пройден");
    }

    private static void login() {
        getWebDriver().findElement(By.cssSelector("#main_navigation > a")).click();
        getWebDriver().findElement(By.cssSelector("a.list-group-item")).click();
        getWebDriver().findElement(By.id("loginform-username")).sendKeys(LOGIN);
        getWebDriver().findElement(By.id("loginform-password")).sendKeys(PASSWORD);
        getWebDriver().findElement(By.cssSelector("#login-form > div.text-end.pt-3 > button")).click();
    }

    public static void logout() {

        getWebDriver().findElement(By.cssSelector(".logo-link")).click();
        getWebDriver().findElement(By.cssSelector(".fa-sign-in-alt")).click();
        getWebDriver().quit();

    }

    public static void addShoppingCart() {
        getWebDriver().findElement(By.cssSelector("#main_navigation > ul.navbar-nav > .nav-item:nth-child(4) > .nav-link")).click();
        getWebDriver().findElement(By.cssSelector(".position-relative:nth-child(1) > a")).click();
        getWebDriver().findElement(By.linkText("100")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(3) > .caption > .buttons > .btn-warning")).click();
        getWebDriver().findElement(By.cssSelector("#w0 > div.form-group .btn")).click();
    }

    public static void openCart() {
        getWebDriver().findElement(By.cssSelector("#cart > button")).click();
        getWebDriver().findElement(By.cssSelector("#fast_cart > div > a")).click();

    }

    public static void delShoppingCart() {
        getWebDriver().findElement(By.cssSelector(".cabinet-menu > a:nth-child(6)")).click();
        getWebDriver().findElement(By.cssSelector("tr > td:nth-child(7) > .trash")).click();
    }
}
