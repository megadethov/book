package ua.mega.domain;

import java.util.Date;

public class Email {
    private String name;
    private Date registrationDate;

    public Email() {
    }

    public Email(String name, Date registrationDate) {
        this.name = name;
        this.registrationDate = registrationDate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getRegistrationDate() {
        return registrationDate;
    }

    public void setRegistrationDate(Date registrationDate) {
        this.registrationDate = registrationDate;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Email email = (Email) o;

        if (name != null ? !name.equals(email.name) : email.name != null) return false;
        return registrationDate != null ? registrationDate.equals(email.registrationDate) : email.registrationDate == null;
    }

    @Override
    public int hashCode() {
        int result = name != null ? name.hashCode() : 0;
        result = 31 * result + (registrationDate != null ? registrationDate.hashCode() : 0);
        return result;
    }
}
