package ua.mega.serialization;

import java.io.Serializable;

public class Ticket implements Serializable {
    String id;

    String title;

    public Ticket(String id, String title) {
        this.id = id;
        this.title = title;
    }

    @Override
    public String toString() {
        return "ua.mega.serialization.Ticket{" +
                "id='" + id + '\'' +
                ", title='" + title + '\'' +
                '}';
    }
}
