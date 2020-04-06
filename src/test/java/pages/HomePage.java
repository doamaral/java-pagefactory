package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class HomePage extends BasePage {
    public HomePage(WebDriver driver){
        this.driver = driver;
    }
    public String getLoginMessage(){
        return this.driver.findElement(By.className("alert-success")).getText();
    }
}
