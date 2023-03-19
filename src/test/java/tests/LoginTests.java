package tests;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class LoginTests extends TestBase {

    @BeforeMethod
    public void preCondition() {
        if (app.getHelperUser().isLogged()) {
            app.getHelperUser().logout();
        }
    }

    @Test
    public void loginSuccess() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("noa123@mail.ru", "Noa12345!");
        app.getHelperUser().submitLogin();
        app.getHelperUser().buttonOK();

        Assert.assertTrue(app.getHelperUser().isLogged());
    }

    @Test
    public void loginSuccessModel() {
        app.getHelperUser().openLoginForm();
        app.getHelperUser().fillLoginForm("noa123@mail.ru", "Noa12345!");
        app.getHelperUser().submitLogin();
        app.getHelperUser().buttonOK();

        Assert.assertTrue(app.getHelperUser().isLogged());
    }
}
