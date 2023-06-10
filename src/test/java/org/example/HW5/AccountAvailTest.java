package org.example.HW5;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class AccountAvailTest extends AbstractTest {
    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    @Test
    @DisplayName("Тест-кейс №4: ")
    public void accountAvail() {
        login();
        SearchTest.searchProduct();
        accountAvailDel();
        logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №4 пройден");
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

    public static void accountAvailDel() {
        getWebDriver().findElement(By.cssSelector(".modal-footer > .d-flex > text-end > a")).click();
        getWebDriver().findElement(By.cssSelector("tr:nth-child(1) > td:nth-child(7) > .trash")).click();
        getWebDriver().findElement(By.cssSelector("tr:nth-child(2) > td:nth-child(7) > .trash")).click();
    }
}
