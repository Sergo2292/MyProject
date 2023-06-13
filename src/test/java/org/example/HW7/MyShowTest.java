package org.example.HW7;

import io.qameta.allure.Link;
import io.qameta.allure.Severity;
import io.qameta.allure.SeverityLevel;
import jdk.jfr.Description;
import org.example.HW3.HW6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MyShowTest extends AbstractTest {
    @Test
    @DisplayName("Тест-кейс №1")
    @Description("Авторизация на сайте")
    @Link("https://xn----dtbfeaonyp6bw5b.xn--p1ai/")
    @Severity(SeverityLevel.BLOCKER)
    public void authorizationTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №1 пройден");
    }

    @Test
    @DisplayName("Тест-кейс №2")
    @Description("Корзина: добавление и удаление товара")
    @Link
    @Severity(SeverityLevel.NORMAL)
    public void shoppingCart() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .shoppingCart()
                .enteringShoppingCart()
                .cartShoppingCart()
                .delShoppingCart()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №2 пройден");
    }

    @Test
    @DisplayName("Тест-кейс №3")
    @Description("Поиск")
    @Link
    @Severity(SeverityLevel.MINOR)
    public void search() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .search1()
                .kitchenKantry()
                .search2()
                .badroomBasya()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №3 пройден");
    }

    @Test
    @DisplayName("Тест-кейс №4")
    @Description("Удаление продукции из корзины")
    @Link
    @Severity(SeverityLevel.TRIVIAL)
    public void accountAvail() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .search2()
                .badroomBasya()
                .search1()
                .kitchenKantry()
                .enteringShoppingCart()
                .delete()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №4 пройден");
    }

    @Test
    @DisplayName("Тест-кейс №5")
    @Description("Избранное добавление и удаление")
    @Link
    @Severity(SeverityLevel.CRITICAL)
    public void wishList() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .addwishList()
                .enteringShoppingCart()
                .wishful()
                .clearWishList()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №5 пройден");
    }

    @Test
    @DisplayName("Тест-кейс №6")
    @Description("Сравнение товаров")
    @Link
    @Severity(SeverityLevel.TRIVIAL)
    public void comparison() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .dryingMachines()
                .addComparison()
                .enteringShoppingCart()
                .comparison()
                .clearComparison()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №6 пройден");
    }
}
