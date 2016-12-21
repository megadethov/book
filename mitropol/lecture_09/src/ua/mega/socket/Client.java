package ua.mega.socket;

import ua.mega.serialization.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("localhost", 3000); // подключение к Серверу на сокет localhost:3000
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // будем гнать на сервер объект
        oos.writeObject(new Person("Вася", "Пупкин", 33));
    }
}
