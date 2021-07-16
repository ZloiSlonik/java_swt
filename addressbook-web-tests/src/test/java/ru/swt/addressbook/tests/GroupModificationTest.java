package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.swt.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("TestJuly", "NewHeaderJuly", "NewFooterJuly"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before);
    }
}
