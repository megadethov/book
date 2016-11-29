package se.lecture_07_IO.item_7;

import java.io.Serializable;

public class Test implements Serializable {
    public String field = "test";

    @Override
    public String toString() {
        return "Test{" +
                "field='" + field + '\'' +
                '}';
    }
}
