package tests.base;

import LoginPage.LoginPage;
import common.CommonAction;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterSuite;
import pages.AddEntry.AddEntry;
import pages.DeleteInAdminPanel.DeleteInAdminPanel;
import pages.HomeAdminPanel.HomeAdminPanel;
import pages.base.BasePage;


import java.util.Set;

public class BaseTest {
    protected WebDriver driver = CommonAction.CreateDriver();
    protected AddEntry AddEntry = new AddEntry(driver);
    protected BasePage basePage = new BasePage(driver);
    protected LoginPage LoginPage = new LoginPage(driver);
    protected HomeAdminPanel HomeAdminPanel = new HomeAdminPanel(driver);
    protected AddEntry addEntry = new AddEntry(driver);
    protected DeleteInAdminPanel DeleteInAdminPanel = new DeleteInAdminPanel(driver);
    void SwitchWindow(){
        JavascriptExecutor js = (JavascriptExecutor) driver;
        String window1 = driver.getWindowHandle();
        js.executeScript("window.open()");
        Set<String> currentlyWindows = driver.getWindowHandles();
        String window2 = null;
        for(String window: currentlyWindows){
            if (!window.equals(window1)){
                window2 = window;
                break;
            }
        }
        driver.switchTo().window(window2);
    }
    @AfterSuite(alwaysRun = true)
    public void quite (){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
