package pages.AddEntry;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import pages.base.BasePage;

import java.util.Random;

public class AddEntry extends BasePage {
    public AddEntry(WebDriver driver){
        super(driver);
    }
    By TittleAddEntryId = By.id("id_title");
    By SlugAddEntryId = By.id("id_slug");
    By TextMarkDownAddEntryId = By.id("id_text_markdown");
    By TextAddEntryId = By.id("id_text");
    By SaveSubmitAddEntryXpath = By.xpath("//input[@name ='_save']");
    String TittleAddEntry = "Title + GenerateRandomNumber()";
    public String TittleAddEntryPublick = TittleAddEntry;
    String SlugAddEntry = "Slug";
    String TextMarkDownAddEntry = "Slug";
    String TextAddEntry = "Slug";
    public AddEntry EnterValueAddEntry(){
        driver.findElement(TittleAddEntryId).sendKeys(TittleAddEntry);
        driver.findElement(SlugAddEntryId).sendKeys(SlugAddEntry + GenerateRandomNumber());
        driver.findElement(TextMarkDownAddEntryId).sendKeys(TextMarkDownAddEntry + GenerateRandomNumber());
        driver.findElement(TextAddEntryId).sendKeys(TextAddEntry + GenerateRandomNumber());
        return this;
    }
    public AddEntry ClickToSaveAddEntry(){
        driver.findElement(SaveSubmitAddEntryXpath).click();
        return this;
    }
    public int GenerateRandomNumber(){
        int min = 1;
        int max = 1000000000;
        int j = new Random().nextInt(max-min);
        return j;
    }

}
