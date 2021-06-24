package ru.swt.addressbook.tests;

import org.testng.annotations.Test;
import ru.swt.addressbook.model.PersonData;

public class ContactDeletionTest extends TestBase {

    @Test
    public void testPersonDeletion() {
        app.getContactHelper().goToContactList();
        if (! app.getContactHelper().isThereAContact()) {
app.getContactHelper().createContact(new PersonData("User_added", "Lastname_added", "Nick_added", "Firma_added",
        "test@test.com", "7", "March", "1981", "TestX"), true);
        }

        app.getContactHelper().selectContact();
        app.getContactHelper().initContactDeletion();
        app.getContactHelper().confirmDeletion();

    }
}
