package ru.swt.addressbook;

public class PersonData {
    private final String first_name;
    private final String last_name;
    private final String nick_name;
    private final String company_name;
    private final String email;
    private final String bd_date;
    private final String bd_month;
    private final String bd_year;

    public PersonData(String first_name, String last_name, String nick_name, String company_name, String email, String bd_date, String bd_month, String bd_year) {
        this.first_name = first_name;
        this.last_name = last_name;
        this.nick_name = nick_name;
        this.company_name = company_name;
        this.email = email;
        this.bd_date = bd_date;
        this.bd_month = bd_month;
        this.bd_year = bd_year;
    }

    public String getFirst_name() {
        return first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public String getNick_name() {
        return nick_name;
    }

    public String getCompany_name() {
        return company_name;
    }

    public String getEmail() {
        return email;
    }

    public String getBd_date() {
        return bd_date;
    }

    public String getBd_month() {
        return bd_month;
    }

    public String getBd_year() {
        return bd_year;
    }
}
