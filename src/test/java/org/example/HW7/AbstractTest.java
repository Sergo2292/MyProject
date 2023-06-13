package org.example.HW7;

import io.github.bonigarcia.wdm.WebDriverManager;
import org.example.HW3.HW7.MyWebDriverEventListener;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.concurrent.TimeUnit;

public abstract class AbstractTest {
    Logger logger = LoggerFactory.getLogger("Test's case 1-6");
    static EventFiringWebDriver driver;
    public static final int time = 10;
    public static final String URL = "https://xn----dtbfeaonyp6bw5b.xn--p1ai/";

    @BeforeAll
    public static void setDriver() {
        WebDriverManager.chromedriver().setup();
        ChromeOptions options = new ChromeOptions();
        options.addArguments("--incognito");
        options.addArguments("start-maximized");
        options.addArguments("--remote-allow-origins=*");
        driver = new EventFiringWebDriver(new ChromeDriver(options));
        driver.register(new MyWebDriverEventListener());

        driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
        driver.manage().timeouts().pageLoadTimeout(time, TimeUnit.SECONDS);
    }

    @BeforeEach
    public  void initMainPage() {
        driver.get(URL);
    }

    @AfterAll
    public static void exit() {
        driver.quit();
    }

    public WebDriver getWebDriver() {
        return this.driver;
    }
}

