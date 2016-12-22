package ua.mega.socket;

import ua.mega.serialization.Person;

import java.io.IOException;
import java.io.ObjectOutputStream;
import java.net.Socket;

public class Client {
    public static void main(String[] args) throws IOException, InterruptedException {
        Socket socket = new Socket("localhost", 3000); // подключение к Серверу на сокет localhost:3000
//        socket.setSoTimeout(10000); // время допустимого простоя до закрытия сокета
        ObjectOutputStream oos = new ObjectOutputStream(socket.getOutputStream()); // будем гнать на сервер объект

        oos.writeObject(new Person("Вася", "Пупкин", 33));
        Thread.sleep(10000);
        oos.writeObject(new Person("Петя", "Ложкин", 42));
        oos.writeObject(new Person("Вова", "Соскин", 15));

        oos.close();
        socket.close();
    }

}
