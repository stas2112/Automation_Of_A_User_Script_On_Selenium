package tests.DeleteBlogTest;

import org.testng.annotations.Test;
import tests.base.BaseTest;

public class DeleteBlogTest extends BaseTest {
    @Test
    public void DeleteBlogInAdminPanel(){
        basePage.open("https://igorakintev.ru/admin/blog/entry/");
        DeleteInAdminPanel
                .DeleteBlogInAdminPanel();
        System.out.println("Блог был удалён");

    }
}
