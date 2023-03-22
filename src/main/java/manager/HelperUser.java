package manager;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HelperUser extends HelperBase {
    public HelperUser(WebDriver wd) {

        super(wd);
    }

    public void openLoginForm() {
        //      WebElement loginTab = wd.findElement(By.cssSelector("[href='/login?url=%2Fsearch']"));
        //      loginTab.click();
        click(By.cssSelector("[href='/login?url=%2Fsearch']"));
    }

    public void fillLoginForm(String email, String password) {
        //      WebElement emailInput = wd.findElement(By.id("#email"));
        //      emailInput.click();
        //      emailInput.clear();
        //      emailInput.sendKeys(email);
        type(By.id("email"), email);

        // WebElement passwordInput = wd.findElement(By.id("#password"));
        //     emailInput.click();
        //     emailInput.clear();
        //     emailInput.sendKeys(password);
        type(By.id("password"), password);
    }

    public void submitLogin() {
        click(By.cssSelector("[type='submit']"));
    }

    public void buttonOK() {
        click(By.cssSelector("[type='button']"));
    }

    public boolean isLogged() {
        return isElementPresent(By.xpath("//a[normalize-space()='Logout']"));
    }

    public void logout() {
        click(By.xpath("//a[normalize-space()='Logout']"));
        wd.navigate().to("https://ilcarro.web.app/search");
    }

    public boolean isPasswordWrong() {
        return isElementPresent(By.cssSelector(".positive-button"));
    }
    public String getMessage() {

        //  WebDriverWait wait = new WebDriverWait(wd, Duration.ofSeconds(5));
        //   wait.until(ExpectedConditions.visibilityOf(wd.findElement(By.cssSelector(".dialog-container>2"))));
        return wd.findElement(By.cssSelector(".dialog-container>h2")).getText();
    }




    public void closeWindow() {
        click(By.xpath("//button[text()='Ok']"));
    }
}
