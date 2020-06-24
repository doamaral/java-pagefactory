package driver;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class SingletonDriverFactory {

    private static WebDriver driver;
    public static int numberOfInstances = 0;

    private SingletonDriverFactory(){
        //make it private so nobody can instatiate an object of SingletonDriver
    }

    public static WebDriver getFirefoxDriver(){
        System.out.println("Evaluating if a webdriver is already instatiated");
        if(driver == null){
            System.out.println("driver is null, creating a firefox webdriver");
            System.setProperty("webdriver.gecko.driver", "C:\\webdrivers\\geckodriver.exe");
            driver = new FirefoxDriver();
            numberOfInstances++;
        }else{
            System.out.println("Webdriver is already instatiated");
        }
        return driver;
    }


}
