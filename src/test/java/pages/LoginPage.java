package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class LoginPage extends BasePage{
    @FindBy(how = How.ID, using="email")
    private WebElement login;

    @FindBy(how = How.ID, using = "senha")
    private WebElement password;

    @FindBy(how = How.CLASS_NAME, using = "btn-primary")
    private WebElement buttonSubmit;

    public LoginPage(WebDriver driver) {
        super(driver);
    }

    public void fillLoginForm(String user, String password){
        fillInputText(this.login, user);
        fillInputText(this.password, password);
        clickButton(this.buttonSubmit);
    }
}
