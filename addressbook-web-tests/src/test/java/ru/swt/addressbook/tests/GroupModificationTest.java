package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.swt.addressbook.model.GroupData;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        int before = app.getGroupHelper().getGroupCounter();
        app.getGroupHelper().selectGroup(before -1);
        app.getGroupHelper().initGroupModification();
        app.getGroupHelper().fillGroupForm(new GroupData("TestJuly2_new", "NewHeaderJuly2", "NewFooterJuly2"));
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        int after = app.getGroupHelper().getGroupCounter();
        Assert.assertEquals(after, before);
    }
}
