package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.swt.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().createGroup(new GroupData("123", "456", "789"));
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before +1);
        app.logout();
    }

}
