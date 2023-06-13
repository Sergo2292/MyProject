package org.example.HW6;

import org.example.HW3.HW6.MainPage;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

public class MainPageTest extends AbstractTest {
    @Test
    @DisplayName("Тест-кейс №1: Авторизация на сайте")
    public void authorizationTest() {
        MainPage mainPage = new MainPage(getWebDriver());
        mainPage
                .login()
                .logout();
        Assertions.assertTrue(getWebDriver().getCurrentUrl().contains("logout"));
        logger.info("Тест-кейс №1 пройден");
    }

    @Test
    @DisplayName("Тест-кейс№2: Корзина: добавление и удаление товара")
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
    @DisplayName("Тест-кейс №3: Поиск")
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
    @DisplayName("Тест-кейс №4: Удаление продукции из корзины")
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
    @DisplayName("Тест-кейс №5: Избранное добавление и удаление")
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
    @DisplayName("Тест-кейс №6: Сравнение товаров")
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
