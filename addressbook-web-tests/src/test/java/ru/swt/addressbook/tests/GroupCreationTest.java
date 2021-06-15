package ru.swt.addressbook.tests;

import org.testng.annotations.*;
import ru.swt.addressbook.model.GroupData;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    app.gotoGroupPage();
    app.initGroupCreation();
    app.fillGroupForm(new GroupData("Group6", "Group_header6", "Group_footer6"));
    app.submitGroupCreation();
    app.returnToGroupPage();
    app.logout();
  }

}
