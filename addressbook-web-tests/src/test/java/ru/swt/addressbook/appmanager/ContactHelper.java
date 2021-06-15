package ru.swt.addressbook.appmanager;

import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;
import ru.swt.addressbook.model.PersonData;

public class ContactHelper {

    private FirefoxDriver wd;

    public ContactHelper(FirefoxDriver wd) {
        this.wd = wd;
    }

    public void submitPersonCreation() {
        wd.findElement(By.xpath("(//input[@name='submit'])[2]")).click();
    }

    public void fillPersonForm(PersonData personData) {
        wd.findElement(By.name("firstname")).click();
        wd.findElement(By.name("firstname")).clear();
        wd.findElement(By.name("firstname")).sendKeys(personData.getFirst_name());
        wd.findElement(By.name("theform")).click();
        wd.findElement(By.name("lastname")).click();
        wd.findElement(By.name("lastname")).clear();
        wd.findElement(By.name("lastname")).sendKeys(personData.getLast_name());
        wd.findElement(By.xpath("//div[@id='content']/form/label[4]")).click();
        wd.findElement(By.name("nickname")).click();
        wd.findElement(By.name("nickname")).clear();
        wd.findElement(By.name("nickname")).sendKeys(personData.getNick_name());
        wd.findElement(By.name("company")).click();
        wd.findElement(By.name("company")).clear();
        wd.findElement(By.name("company")).sendKeys(personData.getCompany_name());
        wd.findElement(By.name("email")).click();
        wd.findElement(By.name("email")).sendKeys(personData.getEmail());
        wd.findElement(By.name("bday")).click();
        new Select(wd.findElement(By.name("bday"))).selectByVisibleText(personData.getBd_date());
        wd.findElement(By.xpath("//option[@value='" + personData.getBd_date() + "']")).click();
        wd.findElement(By.name("bmonth")).click();
        new Select(wd.findElement(By.name("bmonth"))).selectByVisibleText(personData.getBd_month());
        wd.findElement(By.xpath("//option[@value='" + personData.getBd_month() + "']")).click();
        wd.findElement(By.name("byear")).click();
        wd.findElement(By.name("byear")).clear();
        wd.findElement(By.name("byear")).sendKeys(personData.getBd_year());
        wd.findElement(By.name("theform")).click();
    }

    public void initPersonCreation() {
        wd.findElement(By.linkText("add new")).click();
    }
}
