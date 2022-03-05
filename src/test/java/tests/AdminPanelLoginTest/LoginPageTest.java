package tests.AdminPanelLoginTest;


import org.testng.annotations.Test;
import tests.base.BaseTest;



public class LoginPageTest extends BaseTest {
    @Test
    public void LoginInAmdinPanel(){
        basePage.open("https://igorakintev.ru/admin/");
        LoginPage.LoginInAdminPanel();
    }

}
