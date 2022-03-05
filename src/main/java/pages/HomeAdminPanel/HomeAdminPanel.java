package pages.HomeAdminPanel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import pages.base.BasePage;
import sun.plugin.dom.core.Element;

import static org.testng.AssertJUnit.assertEquals;

public class HomeAdminPanel extends BasePage {
    public HomeAdminPanel (WebDriver driver){
        super(driver);
    }
    By AddInBlogEntries = By.xpath("//a[@href='/admin/blog/entry/add/']");
    boolean ContainsTrue = true;


    public HomeAdminPanel EqualsTitleInPanel(){
        String TitlePanel = "Панель управления";
        String ActualTitle = driver.getTitle();
        boolean ActualContains = ActualTitle.contains(TitlePanel);
        assertEquals(ContainsTrue, ActualContains);
        return this;
    }
    public HomeAdminPanel clickToAddBlogEntries(){
        driver.findElement(AddInBlogEntries).click();
        return this;
    }

}
