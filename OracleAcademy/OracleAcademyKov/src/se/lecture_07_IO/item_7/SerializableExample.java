package se.lecture_07_IO.item_7;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class SerializableExample {
    public static void main(String[] args) throws IOException {
        String fileName = "src\\se\\lecture_07_IO\\item_7\\fileForObjects.txt";

        User user = new User(100, 25, "Karl", new Test(), "secure");
        System.out.println(user);

        ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(fileName));
        out.writeObject(user); // пишем сериализованный объект в файл
    }
}
