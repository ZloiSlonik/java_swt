package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.swt.addressbook.model.GroupData;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCounter();
        if (!app.getGroupHelper().isThereAGroup()) {
         app.getGroupHelper().createGroup(new GroupData("Group_added", "Test88", null));
        }
        app.getGroupHelper().selectGroup(before -1);
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before -1);
        app.logout();
    }
}
