package tests.HomeAdminPanelTest;

import org.testng.annotations.Test;
import pages.HomeAdminPanel.HomeAdminPanel;
import tests.base.BaseTest;

public class HomeAdminPanelTest extends BaseTest {
    @Test
    public void EqualsTitleClickToAddBlogEntries(){
        HomeAdminPanel
                .EqualsTitleInPanel()
                .clickToAddBlogEntries();


    }
}
