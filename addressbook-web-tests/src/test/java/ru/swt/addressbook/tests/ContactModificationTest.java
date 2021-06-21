package ru.swt.addressbook.tests;

import org.testng.annotations.Test;
import ru.swt.addressbook.model.PersonData;

public class ContactModificationTest extends TestBase {
    @Test
    public void testContactModification() {
        app.getContactHelper().goToContactList();
        app.getContactHelper().selectContact();
        app.getContactHelper().initContactModification();
        app.getContactHelper().fillPersonForm(
                new PersonData("Ivan798", "Ivanov000", "Qwerty", "CompanyZ",
                        "test@test.com", "7", "March", "1988", null), false);
        app.getContactHelper().submitContactModification();
        app.getContactHelper().goToContactList();

    }

}
