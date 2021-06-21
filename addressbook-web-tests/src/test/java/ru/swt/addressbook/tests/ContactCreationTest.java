package ru.swt.addressbook.tests;

import org.testng.annotations.*;
import ru.swt.addressbook.model.PersonData;

public class ContactCreationTest extends TestBase {

 @Test
  public void testPersonCreation() throws Exception {

    app.getContactHelper().initPersonCreation();
    app.getContactHelper().fillPersonForm(
            new PersonData("User4", "Lastname4", "Nick1", "Firma1",
                    "test@test.com", "7", "March", "1981", "TestX"), true);
    app.getContactHelper().submitPersonCreation();
    app.returnToHomePage();
    app.logout();
  }
}
