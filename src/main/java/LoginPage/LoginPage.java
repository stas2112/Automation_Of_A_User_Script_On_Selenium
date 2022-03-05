package LoginPage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class LoginPage extends BasePage {
    public LoginPage(WebDriver driver){ super(driver);}

     By LoginField = By.id("id_username");
     By PasswordField = By.id("id_password");
     By EnterSubmit = By.xpath("//input[@value='Войти']");
     String Login = "selenium";
     String password = "super_password";
    public LoginPage LoginInAdminPanel(){
        driver.findElement(LoginField).sendKeys(Login);
        driver.findElement(PasswordField).sendKeys(password);
        driver.findElement(EnterSubmit).click();
        return this;}

}