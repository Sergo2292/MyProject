package org.example.HW5;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public class AbstractTest {
    static Logger logger = LoggerFactory.getLogger("Test-Case's");
    private static WebDriver driver;
    private static final int time = 1;
    private static final String URL = "https://xn----dtbfeaonyp6bw5b.xn--p1ai/";


    @BeforeAll
    public static void init() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new ChromeDriver(options);
        driver.manage().timeouts().implicitlyWait(time, TimeUnit.MINUTES);
    }

    @BeforeEach
    public void goTo() {
        driver.get(URL);
    }

    @AfterAll
    public static void close() {
        driver.quit();
    }

    public static WebDriver getWebDriver() {
        return driver;
    }
}
