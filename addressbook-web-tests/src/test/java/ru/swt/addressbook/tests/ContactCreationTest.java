package ru.swt.addressbook.tests;

import org.testng.Assert;
import org.testng.annotations.*;
import ru.swt.addressbook.model.PersonData;

public class ContactCreationTest extends TestBase {

 @Test
  public void testPersonCreation() throws Exception {

     int before = app.getContactHelper().getContactCounter();
     app.getContactHelper().createContact(new PersonData("User4", "Lastname4", "Nick1", "Firma1",
"test@test.com", "7", "March", "1981", "TestX"), true);
     int after = app.getContactHelper().getContactCounter();
     Assert.assertEquals(after, before +1);
     app.logout();
  }
}
