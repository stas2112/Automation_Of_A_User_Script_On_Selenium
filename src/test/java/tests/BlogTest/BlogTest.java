package tests.BlogTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;
import pages.AddEntry.AddEntry;
import tests.base.BaseTest;

import java.util.List;

public class BlogTest extends BaseTest {
    @Test
    public void CheckIsRecordInBlock() {
        basePage.open("https://igorakintev.ru/blog/");
        List<WebElement> tittlesInBlog= driver.findElements(By.xpath("//a[@class='entry_title']"));
        for (WebElement e: tittlesInBlog){
            if (e.getText().equals(AddEntry.TittleAddEntryPublick)){
                System.out.println("Блог был создан");
                break;
            }

    }

}}
