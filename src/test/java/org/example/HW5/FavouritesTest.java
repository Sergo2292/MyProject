package org.example.HW5;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;

public class FavouritesTest extends AbstractTest {

    private static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    @Test
    @DisplayName("Тест-кейс №5: Избранное добавление и удаление")
    public void wishList() {
        login();
        getWebDriver().findElement(By.cssSelector(".absolute-eighteen active > .nav-link")).click();
        getWebDriver().findElement(By.cssSelector(".teaser:nth-child(7) > .thumbnails > .favorite-btn > .fa")).click();
        getWebDriver().findElement(By.cssSelector("#main_navigation >  ul.navbar-nav > .nav-item:nth-child(2) > ul > .nav-item > ul > .active > a")).click();
        getWebDriver().findElement(By.cssSelector(".teaser > .thumbnails > .favorite-btn > .fa")).click();
        getWebDriver().findElement(By.cssSelector("#cart > button")).click();
        getWebDriver().findElement(By.cssSelector("#fast_cart > div > a")).click();
        getWebDriver().findElement(By.cssSelector(".list-group > .list-group-item:nth-child(4)")).click();
        //очистить список желаемого
        getWebDriver().findElement(By.id("clear_wish_list")).click();
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
