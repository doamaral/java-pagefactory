package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    protected WebDriver driver;

    public BasePage(WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(this.driver, this);
    }

    public void fillInputText(WebElement element, String text){
        element.sendKeys(text);
    }
    public void clickButton(WebElement element){
        element.click();
    }
}
