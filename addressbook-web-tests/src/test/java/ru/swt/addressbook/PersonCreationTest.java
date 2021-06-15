package ru.swt.addressbook;

import org.testng.annotations.*;

public class PersonCreationTest extends TestBase {

 @Test
  public void testPersonCreation() throws Exception {

    initPersonCreation();
    fillPersonForm(
            new PersonData("Alexander", "Petrov", "Test", "Firma666",
                    "test@test.com", "7", "March", "1981"));
    submitPersonCreation();
    returnToHomePage();
    logout();
  }
}
