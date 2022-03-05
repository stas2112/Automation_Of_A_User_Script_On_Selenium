package tests.AddEntryAndSave;

import org.testng.annotations.Test;
import tests.base.BaseTest;


public class AddEntryAndSave extends BaseTest {
    @Test
    public void AddEntryAndSaveTest(){
        AddEntry
                .EnterValueAddEntry()
                .ClickToSaveAddEntry();
    }

}
