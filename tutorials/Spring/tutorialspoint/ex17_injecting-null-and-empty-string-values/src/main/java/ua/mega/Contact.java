package ua.mega;

public class Contact {
    private String emailEmpty;
    private String emailNull;

    public String getEmailEmpty() {
        System.out.println("emailEmpty = '" + emailEmpty + "'");
        return emailEmpty;
    }

    public void setEmailEmpty(String emailEmpty) {
        this.emailEmpty = emailEmpty;
    }

    public String getEmailNull() {
        System.out.println("emailNull = '" + emailNull + "'");
        return emailNull;
    }

    public void setEmailNull(String emailNull) {
        this.emailNull = emailNull;
    }
}
