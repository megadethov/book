package ua.mega.staffmanagement.domain;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Date;

@Entity
public class Note implements Serializable{

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int Id;

    private String text;

    @Temporal(TemporalType.TIMESTAMP)
    private Date date;

    public Note() {
    }

    public Note(String text) {
        this.text = text;
        this.date = new Date();
    }

    @Override
    public String toString() {
        return "Note raised at " + this.date + " with contents " + this.text;
    }
}
