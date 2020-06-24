package tests;

import com.sun.xml.internal.bind.v2.runtime.unmarshaller.XsiNilLoader;
import driver.SimpleDriverFactory;
import driver.SingletonDriverFactory;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class BaseTest {
    protected static WebDriver nav = null;

    @BeforeTest
    public void setUp(){
        nav = SingletonDriverFactory.getFirefoxDriver();
        System.out.println(SingletonDriverFactory.numberOfInstances);
        WebDriver nav2 = SingletonDriverFactory.getFirefoxDriver();
        System.out.println(SingletonDriverFactory.numberOfInstances);
        WebDriver nav3 = SingletonDriverFactory.getFirefoxDriver();
        System.out.println(SingletonDriverFactory.numberOfInstances);
        nav.get("http://seubarriga.wcaquino.me/login");
    }

    @AfterTest
    public void tearDown(){
        nav.quit();
    }
}
