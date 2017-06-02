package ua.mega;

import java.util.Date;

public class Answer {
    private int id;
    private String name;
    private Date postedDate;

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

    public Date getPostedDate() {
        return postedDate;
    }

    public void setPostedDate(Date postedDate) {
        this.postedDate = postedDate;
    }

    public Answer() {
    }

    public Answer(int id, String name, Date postedDate) {
        this.id = id;
        this.name = name;
        this.postedDate = postedDate;
    }

    public String toString() {
        return "Id:" + id + " Answer:" + name + " Posted Date:" + postedDate;
    }

}
