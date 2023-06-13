package org.example.HW5;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AuthorizationTest extends AbstractTest {
    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    @Test
    @DisplayName("Тест-кейс №1: Авторизация на сайте")
    public void authorization() {
        login();
        getWebDriver().findElement(By.cssSelector("#main_navigation > ul.navbar-nav > .nav-item:nth-child(3) > .nav-link")).click();
        getWebDriver().findElement(By.cssSelector(".logo-link")).click();
        getWebDriver().findElement(By.cssSelector(".fa-sign-in-alt")).click();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №1 пройден");
    }

    private static void login() {
        getWebDriver().findElement(By.cssSelector("#main_navigation > a")).click();
        getWebDriver().findElement(By.cssSelector("a.list-group-item")).click();
        getWebDriver().findElement(By.id("loginform-username")).sendKeys(LOGIN);
        getWebDriver().findElement(By.id("loginform-password")).sendKeys(PASSWORD);
        getWebDriver().findElement(By.cssSelector("#login-form > div.text-end.pt-3 > button")).click();
    }
}
