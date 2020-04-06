package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SimpleDriverFactory {
    public static WebDriver getFirefoxDriver(){
        System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
        return new FirefoxDriver();
    }
}
