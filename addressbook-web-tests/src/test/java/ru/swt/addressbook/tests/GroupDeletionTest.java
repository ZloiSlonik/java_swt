package ru.swt.addressbook.tests;

import org.testng.annotations.*;

public class GroupDeletionTest extends TestBase {

    @Test
    public void testGroupDeletion() throws Exception {
        app.getNavigationHelper().gotoGroupPage();
        app.getGroupHelper().selectGroup();
        app.getGroupHelper().deleteSelectedGroup();
        app.getGroupHelper().returnToGroupPage();
        app.logout();
    }
}
