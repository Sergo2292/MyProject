package org.example.HW3;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

import java.util.concurrent.TimeUnit;

public class Autorization {
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
    }

    public static void main(String[] args) {
        //вход в аккаунт
        login();
        //столы и стулья
        driver.findElement(By.cssSelector("#main_navigation > ul.navbar-nav > .nav-item:nth-child(3) > .nav-link")).click();
        // переход на главную страницу
        driver.findElement(By.cssSelector(".logo-link")).click();
        //выход из аккаунта
        driver.findElement(By.cssSelector(".fa-sign-in-alt")).click();
        //закрыть браузер
        driver.quit();
    }

    private static void login() {
        driver.get(URL);
        driver.findElement(By.cssSelector("#main_navigation > a")).click();
        driver.findElement(By.cssSelector("a.list-group-item")).click();
        driver.findElement(By.id("loginform-username")).sendKeys(LOGIN);
        driver.findElement(By.id("loginform-password")).sendKeys(PASSWORD);
        driver.findElement(By.cssSelector("#login-form > div.text-end.pt-3 > button")).click();
           }
}

