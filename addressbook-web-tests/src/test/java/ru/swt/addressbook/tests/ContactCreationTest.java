package ru.swt.addressbook.tests;

import org.testng.annotations.*;
import ru.swt.addressbook.model.PersonData;

public class ContactCreationTest extends TestBase {

 @Test
  public void testPersonCreation() throws Exception {

    app.getContactHelper().initPersonCreation();
    app.getContactHelper().fillPersonForm(
            new PersonData("Alexander", "Petrov", "Test", "Firma666",
                    "test@test.com", "7", "March", "1981"));
    app.getContactHelper().submitPersonCreation();
    app.returnToHomePage();
    app.logout();
  }
}
