package org.example.HW5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class ComparisonTest extends AbstractTest {
    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";


    @Test
    @DisplayName("Тест-кейс №6: Сравнение товаров")
    public void comparison() {
        login();
        getWebDriver().findElement(By.cssSelector("#main_navigation >  ul.navbar-nav > .nav-item:nth-child(4) > ul > .nav-item:nth-child(2) > ul > li:nth-child(8) > a")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(9) > .thumbnails > .compare-btn > .fa-balance-scale")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(5) > .thumbnails > .compare-btn > .fa-balance-scale")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(15) > .thumbnails > .compare-btn > .fa-balance-scale")).click();
        getWebDriver().findElement(By.cssSelector("#cart > button")).click();
        getWebDriver().findElement(By.cssSelector("#fast_cart > div > a")).click();
        getWebDriver().findElement(By.cssSelector(".list-group > .list-group-item:nth-child(3)")).click();
        getWebDriver().findElement(By.id("clear_compare_list")).click();
        logout();
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
}
