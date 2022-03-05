package pages.DeleteInAdminPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

public class DeleteInAdminPanel extends BasePage {
    public DeleteInAdminPanel(WebDriver driver){
        super(driver);
    }
    By DeleteBlogCheckBoxInAdminPanel = By.xpath("//input[@id='id_form-0-is_popular']/../..//input[@class='action-select']");
    By SelectOfDo = By.xpath("//select[@name='action']");
    By SelectOfDoDelete = By.xpath("//select[@name='action']/option[@value='delete_selected']");
    By PerformOfDelete = By.xpath("//button[@name='index']");
    By YesImSure = By.xpath("//input[@value='Да, я уверен']");
    public DeleteInAdminPanel DeleteBlogInAdminPanel(){
        driver.findElement(DeleteBlogCheckBoxInAdminPanel).click();
        driver.findElement(SelectOfDo).click();
        driver.findElement(SelectOfDoDelete).click();
        driver.findElement(PerformOfDelete).click();
        driver.findElement(YesImSure).click();
        return this;
    }

}
