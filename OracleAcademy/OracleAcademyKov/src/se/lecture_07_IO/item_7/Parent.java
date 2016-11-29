package se.lecture_07_IO.item_7;

import java.io.Serializable;

public class Parent implements Serializable {
    protected long id;

    public Parent(long id) {
        this.id = id;
    }
}
