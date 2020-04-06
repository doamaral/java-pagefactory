package tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import pages.HomePage;
import pages.LoginPage;

public class LoginPageTest extends BaseTest {
    @Test
    public void shouldLoginSuccessfully(){
        LoginPage login = new LoginPage(nav);
        HomePage home = new HomePage(nav);
        login.fillLoginForm("newuser@testautomation.com", "new");
        String successMessage = home.getLoginMessage();
        Assert.assertEquals(successMessage, "Bem vindo, New User!");
    }
}
