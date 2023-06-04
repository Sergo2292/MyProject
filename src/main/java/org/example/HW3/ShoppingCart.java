package org.example.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class ShoppingCart {


    private static final String URL;

    private static final String LOGIN;

    private static final String PASSWORD;
    public static final WebDriver driver;

    static {
        URL = "https://xn----dtbfeaonyp6bw5b.xn--p1ai/";
        LOGIN = "Uwozyg";
        PASSWORD = "Xzucmkggx5";

        WebDriverManager.chromedriver().setup();

        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");

        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(1, TimeUnit.MINUTES);
        driver.manage().timeouts().pageLoadTimeout(1, TimeUnit.MINUTES);
    }

    public static void main(String[] args) {
        login();
        //переход на страницу - бытовая техника
        driver.findElement(By.cssSelector("#main_navigation > ul.navbar-nav > .nav-item:nth-child(4) > .nav-link")).click();
        //варочные поверхности
        driver.findElement(By.cssSelector(".position-relative > a")).click();
        //показать на странице 100
        driver.findElement(By.linkText("100")).click();
        //добавить варочную панель
      driver.findElement(By.cssSelector(".teaser:nth-child(3) > .caption > .buttons > .btn-warning")).click();
//добавить в корзину
        driver.findElement(By.cssSelector("#w0 > div.form-group .btn")).click();
        //открыть корзину
        driver.findElement(By.cssSelector("#cart > button")).click();
        //оформить заказ
        driver.findElement(By.cssSelector("#fast_cart > div > a")).click();

        driver.findElement(By.cssSelector(".cabinet-menu > a:nth-child(6)")).click();

        driver.findElement(By.cssSelector("tr > td:nth-child(7) > .trash")).click();

        logout();
    }

    private static void login() {
        driver.get(URL);
        driver.findElement(By.cssSelector("#main_navigation > a")).click();
        driver.findElement(By.cssSelector("a.list-group-item")).click();
        driver.findElement(By.id("loginform-username")).sendKeys(LOGIN);
        driver.findElement(By.id("loginform-password")).sendKeys(PASSWORD);
        driver.findElement(By.cssSelector("#login-form > div.text-end.pt-3 > button")).click();
    }

    public static void logout() {
        // переход на главную страницу
        driver.findElement(By.cssSelector(".logo-link")).click();
        //выход из аккаунта
        driver.findElement(By.cssSelector(".fa-sign-in-alt")).click();
        //закрыть браузер
        driver.quit();

    }
}
