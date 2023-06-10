package org.example.HW3.HW6;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class MainPage extends AbstractPage {
    public static final String LOGIN = "Uwozyg";
    public static final String PASSWORD = "Xzucmkggx5";

    public MainPage(WebDriver driver) {
        super(driver);
    }

    @FindBy(css = "#main_navigation > a")
    private WebElement entrance; //вход

    @FindBy(css = "a.list-group-item")
    private WebElement enter; //вкладка войти

    @FindBy(id = "loginform-username")
    private WebElement login;

    @FindBy(id = "loginform-password")
    private WebElement password;

    @FindBy(css = "#login-form > div.text-end.pt-3 > button")
    private WebElement loginButton; //кнопка войти

    @FindBy(css = "#main_navigation > ul.navbar-nav > .nav-item:nth-child(3) > .nav-link")
    private WebElement tables; //столы и стулья

    @FindBy(css = ".logo-link")
    private WebElement home; //главная страница

    @FindBy(css = ".fa-sign-in-alt")
    private WebElement out; //выход из аккаунта

    @FindBy(css = "#main_navigation > ul.navbar-nav > .nav-item:nth-child(4) > .nav-link")
    private WebElement appliances; //бытовая техника

    @FindBy(css = ".position-relative > a")
    private WebElement burner; //варочные поверхности

    @FindBy(linkText = "100")
    private WebElement inputLimitMax; //расширение страницы 100

    @FindBy(css = ".teaser:nth-child(3) > .caption > .buttons > .btn-warning")
    private WebElement addAHope_3; //товар №3 в списке

    @FindBy(css = "#w0 > div.form-group .btn")
    private WebElement btnAddToCart; //добавить в корзину

    @FindBy(css = "#cart > button")
    private WebElement openShoppingCart; //открыть корзину

    @FindBy(css = "#fast_cart > div > a")
    private WebElement placeAnOrder; //кнопка оформить заказ

    @FindBy(css = ".cabinet-menu > a:nth-child(6)")
    private WebElement cart; //переход в корзину в лк

    @FindBy(css = "tr > td:nth-child(7) > .trash")
    private WebElement delFromTrash; //удалить из корзины

    @FindBy(css = "form.search > input.form-control")
    private WebElement search; //поиск

    @FindBy(css = "form.search > button.btn")
    private WebElement searchUp; //перейти в поиск

    @FindBy(css = ".teaser:nth-child(2) > .stretched-link")
    private WebElement up2; //перейти на фасад из списка №2

    @FindBy(css = ".quantity-block > button.btn-warning")
    private WebElement addToCart; //нажать В Корзину

    @FindBy(css = ".modal-footer > .d-flex > .col-md-6 > a")
    private WebElement goToCart; //нажать на перейти в корзину

    @FindBy(css = ".teaser:nth-child(1) > .stretched-link")
    private WebElement up3;

    @FindBy(css = "tr:nth-child(2) > td:nth-child(7) > .trash")
    private WebElement del2; //удаление из корзины товара №2

    @FindBy(css = "tr:nth-child(1) > td:nth-child(7) > .trash")
    private WebElement del1;

    @FindBy(css = ".absolute-eighteen active > .nav-link")
    private WebElement sink; //мойка

    @FindBy(css = ".teaser:nth-child(7) > .thumbnails > .favorite-btn > .fa")
    private WebElement like7; //добавить в избранное 7 товар

    @FindBy(css = "#main_navigation >  ul.navbar-nav > .nav-item:nth-child(2) > ul > .nav-item > ul > .active > a")
    private WebElement livingRoom1; //гостинная берген

    @FindBy(css = ".teaser > .thumbnails > .favorite-btn > .fa")
    private WebElement like1; //добавить в избранное 1 товар

    @FindBy(css = ".list-group > .list-group-item:nth-child(4)")
    private WebElement wishful; //перейти в избранное

    @FindBy(id = "clear_wish_list")
    private WebElement clearWishList; // очистить избранное

    @FindBy(css = "#main_navigation >  ul.navbar-nav > .nav-item:nth-child(4) > ul > .nav-item:nth-child(2) > ul > li:nth-child(8) > a")
    private WebElement dryingMachines; //сушильные машины

    @FindBy(css = ".teaser:nth-child(9) > .thumbnails > .compare-btn > .fa-balance-scale")
    private WebElement addToComparison9; //добавить в сравнение 9 товар

    @FindBy(css = ".teaser:nth-child(5) > .thumbnails > .compare-btn > .fa-balance-scale")
    private WebElement addToComparison5; //добавить в сравнение 9 товар

    @FindBy(css = ".teaser:nth-child(15) > .thumbnails > .compare-btn > .fa-balance-scale")
    private WebElement addToComparison15; //добавить в сравнение 9 товар

    @FindBy(css = ".list-group > .list-group-item:nth-child(3)")
    private WebElement comparison; //переход в сравнении в ЛК

    @FindBy(id = "clear_compare_list")
    private WebElement clearComparison;

    public MainPage login() {
        entrance.click();
        enter.click();
        login.sendKeys(LOGIN);
        password.sendKeys(PASSWORD);
        loginButton.click();
        return this;
    }

    public MainPage logout() {
        home.click();
        out.click();
        return this;
    }

    public MainPage shoppingCart() {
        appliances.click();
        burner.click();
        inputLimitMax.click();
        addAHope_3.click();
        btnAddToCart.click();
        return this;
    }

    public MainPage enteringShoppingCart() {
        openShoppingCart.click();
        placeAnOrder.click();
        return this;
    }

    public MainPage cartShoppingCart() {
        cart.click();
        return this;
    }

    public MainPage delShoppingCart() {
        delFromTrash.click();
        return this;
    }

    public MainPage search1() {
        search.sendKeys("кантри");
        searchUp.click();
        return this;
    }

    public MainPage kitchenKantry() {
        up2.click();
        addToCart.click();
        goToCart.click();
        return this;
    }

    public MainPage search2() {
        search.sendKeys("Бася");
        searchUp.click();
        return this;
    }

    public MainPage badroomBasya() {
        up3.click();
        addToCart.click();
        goToCart.click();
        return this;
    }

    public MainPage delete() {
        del2.click();
        del1.click();
        return this;
    }

    public MainPage addwishList() {
        sink.click();
        like7.click();
        livingRoom1.click();
        like1.click();
        return this;
    }

    public MainPage wishful() {
        wishful.click();
        return this;
    }

    public MainPage clearWishList() {
        clearWishList.click();
        return this;
    }
public MainPage dryingMachines() {
        dryingMachines.click();
        return this;
}


    public MainPage addComparison() {
        addToComparison9.click();
        addToComparison5.click();
        addToComparison15.click();
        return this;
    }

    public MainPage comparison() {
        comparison.click();
        return this;
    }

    public MainPage clearComparison() {
        clearComparison.click();
        return this;
    }
}
