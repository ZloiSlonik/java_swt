package ru.swt.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.swt.addressbook.model.PersonData;

public class ContactHelper extends HelperBase {

    public ContactHelper(FirefoxDriver wd) {
        super(wd);
    }

    public void submitPersonCreation() {
        click(By.xpath("(//input[@name='submit'])[2]"));
    }

    public void fillPersonForm(PersonData personData) {
        type(By.name("firstname"), personData.getFirst_name());
        type(By.name("lastname"), personData.getLast_name());
        type(By.name("nickname"), personData.getNick_name());
        type(By.name("company"), personData.getCompany_name());
        type(By.name("email"), personData.getEmail());
        select(By.name("bday"), personData.getBd_date());
        click(By.xpath("//option[@value='" + personData.getBd_date() + "']"));
        click(By.name("bmonth"));
        select(By.name("bmonth"), personData.getBd_month());
        click(By.xpath("//option[@value='" + personData.getBd_month() + "']"));
        type(By.name("byear"), personData.getBd_year());
        click(By.name("theform"));
    }

    public void initPersonCreation() {
        click(By.linkText("add new"));
    }

    public void initContactDeletion() {
        click(By.xpath("//input[@value='Delete']"));
    }

    public void confirmDeletion() {wd.switchTo().alert().accept();}

    public void goToContactList() {
        click(By.linkText("home"));
    }

    public void selectContact() {

        click(By.xpath("//table[@id='maintable']/tbody/tr[2]/td/input"));

    }
}
