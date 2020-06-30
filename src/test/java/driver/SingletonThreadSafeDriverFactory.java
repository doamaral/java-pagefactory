package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonThreadSafeDriverFactory {

    private static WebDriver driver;

    private SingletonThreadSafeDriverFactory(){
        //make it private so nobody can instatiate an object of SingletonDriver
    }

    public static synchronized WebDriver getFirefoxDriver(){
        if(driver == null){
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
        }
        return driver;
    }


}
