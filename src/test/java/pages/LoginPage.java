package pages;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage extends BasePage{

    public LoginPage(WebDriver driver){
        this.driver = driver;
    }

    public void fillLoginForm(String user, String password){
        fillInputText(this.driver.findElement(By.id("email")), user);
        fillInputText(this.driver.findElement(By.id("senha")), password);
        clickButton(this.driver.findElement(By.className("btn-primary")));
    }
}
