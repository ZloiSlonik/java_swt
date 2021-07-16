package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.Test;
import ru.swt.addressbook.appmanager.GroupHelper;
import ru.swt.addressbook.model.GroupData;

import java.util.HashSet;
import java.util.List;

public class GroupModificationTest extends TestBase {

    @Test
    public void testGroupModification() {
        app.getNavigationHelper().gotoGroupPage();
        if (! app.getGroupHelper().isThereAGroup()) {
            app.getGroupHelper().createGroup(new GroupData ("text666", null, null));
        }
        List<GroupData> before = app.getGroupHelper().getGroupList();
        app.getGroupHelper().selectGroup(before.size() -1);
        app.getGroupHelper().initGroupModification();
        GroupData group = new GroupData (before.get(before.size() -1).getId(),"test8", "Hot", "Hot2");
        app.getGroupHelper().fillGroupForm(group);
        app.getGroupHelper().submitGroupModification();
        app.getGroupHelper().returnToGroupPage();
        List<GroupData> after = app.getGroupHelper().getGroupList();
        Assert.assertEquals(after.size(), before.size());

        before.remove(before.size() -1);
        before.add(group);
        Assert.assertEquals(new HashSet<>(before), new HashSet<>(after));
    }
}
