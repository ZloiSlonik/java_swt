package ru.swt.addressbook.tests;

import org.testng.annotations.*;
import ru.swt.addressbook.model.PersonData;

public class PersonCreationTest extends TestBase {

 @Test
  public void testPersonCreation() throws Exception {

    app.initPersonCreation();
    app.fillPersonForm(
            new PersonData("Alexander", "Petrov", "Test", "Firma666",
                    "test@test.com", "7", "March", "1981"));
    app.submitPersonCreation();
    app.returnToHomePage();
    app.logout();
  }
}
