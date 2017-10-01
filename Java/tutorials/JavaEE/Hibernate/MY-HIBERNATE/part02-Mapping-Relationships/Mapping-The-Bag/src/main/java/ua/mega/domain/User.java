package ua.mega.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class User {
    private int id;
    private String name;
    private int age;
    private Collection<Email> emails = new ArrayList<>();
    private Collection<String> phones = new ArrayList<>();

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Collection<Email> getEmails() {
        return emails;
    }

    public void setEmails(Collection<Email> emails) {
        this.emails = emails;
    }

    public Collection<String> getPhones() {
        return phones;
    }

    public void setPhones(Collection<String> phones) {
        this.phones = phones;
    }
}
