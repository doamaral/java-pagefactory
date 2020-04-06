package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class BasePage {
    protected WebDriver driver = null;

    public void fillInputText(WebElement element, String text){
        element.sendKeys(text);
    }
    public void clickButton(WebElement element){
        element.click();
    }
}
