package ru.swt.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.NoSuchElementException;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import ru.swt.addressbook.model.PersonData;

public class ContactHelper extends HelperBase {

    public ContactHelper(WebDriver wd) {
        super(wd);
    }

    public void submitPersonCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillPersonForm(PersonData personData, boolean creation ) {
        type(By.name("firstname"), personData.getFirst_name());
        type(By.name("lastname"), personData.getLast_name());
        type(By.name("nickname"), personData.getNick_name());
        type(By.name("company"), personData.getCompany_name());
        type(By.name("email"), personData.getEmail());
        select(By.name("bday"), personData.getBd_date());
        select(By.name("bmonth"), personData.getBd_month());
        type(By.name("byear"), personData.getBd_year());

        if (creation) {
            select(By.name("new_group"), personData.getGroup());
        } else {
            Assert.assertFalse (isElementPresent(By.name("new_group")));
        }
    }

    public void initPersonCreation() {
        click(By.linkText("add new"));
    }

    public void initContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void confirmDeletion() {
        wd.switchTo().alert().accept();
    }

    public void goToContactList() {
        click(By.linkText("home"));
    }

    public void selectContact() {

        click(By.name("selected[]"));
        //click(By.xpath("//table[@id='maintable']/tbody/tr[1]/td/input"));

    }

    public void initContactModification() {
        click(By.xpath("//img[@alt='Edit']"));
    }

    public void submitContactModification() {
        click(By.name("update"));
    }

    public void createContact(PersonData contact, boolean b) {
       initPersonCreation();
        fillPersonForm(contact, b);
       submitPersonCreation();
       goToContactList();
       }

    public boolean isThereAContact() {
        return isElementPresent(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input"));
    }
}
