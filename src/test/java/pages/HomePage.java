package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class HomePage extends BasePage {
    @FindBy(how = How.CLASS_NAME, using = "alert-success")
    private WebElement messageBox;

    public HomePage(WebDriver driver){
        super(driver);
    }
    public String getLoginMessage(){
        return messageBox.getText();
    }
}
