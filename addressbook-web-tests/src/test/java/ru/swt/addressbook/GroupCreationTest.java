package ru.swt.addressbook;

import org.testng.annotations.*;

public class GroupCreationTest extends TestBase {

  @Test
  public void testGroupCreation() throws Exception {
    gotoGroupPage();
    initGroupCreation();
    fillGroupForm(new GroupData("Group6", "Group_header6", "Group_footer6"));
    submitGroupCreation();
    returnToGroupPage();
    logout();
  }

}
