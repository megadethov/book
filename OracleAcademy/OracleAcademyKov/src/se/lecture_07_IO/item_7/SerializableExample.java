package se.lecture_07_IO.item_7;

import java.io.*;

public class SerializableExample {
    public static void main(String[] args) {
        String fileName = "src\\se\\lecture_07_IO\\item_7\\fileForObjects.txt";

        User user = new User(100, 25, "Karl", new Test(), "secure");
        System.out.println(user);

        ObjectOutputStream out = null;
        ObjectInputStream in = null;

        try {
            // Сериализация объекта
            out = new ObjectOutputStream(new FileOutputStream(fileName));
            out.writeObject(user); // пишем сериализованный объект в файл

            // Десериализация объекта
            in = new ObjectInputStream(new FileInputStream(fileName));
            User userFromFile = (User) in.readObject(); // при чтении нужно явно кастовать
            System.out.println(userFromFile);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException | ClassNotFoundException e2) {
            e2.printStackTrace();
        } finally {
            if (in != null) try {
                in.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }


    }
}
