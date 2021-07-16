package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.swt.addressbook.model.GroupData;
import java.util.List;

public class GroupCreationTest extends TestBase {

    @Test
    public void testGroupCreation() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().createGroup(new GroupData("zzz", "yyy", "xxx"));
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size() +1);
        app.logout();
    }

}
