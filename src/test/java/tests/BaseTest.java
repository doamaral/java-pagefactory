package tests;

import driver.SingletonDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver nav = null;

    @BeforeTest
    public void setUp(){
        nav = SingletonDriverFactory.getFirefoxDriver();
        nav.get("http://seubarriga.wcaquino.me/login");
    }

    @AfterTest
    public void tearDown(){
        nav.quit();
    }
}
