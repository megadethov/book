package ua.mega.socket;

import ua.mega.serialization.Person;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

// сокет - это пара = домен+порт
public class Server {
    public static void main(String[] args) throws IOException, ClassNotFoundException {

        // Серверный сокет с портом 3000 (висит на нем и слушает), находится на локальной машине
        ServerSocket serverSocket = new ServerSocket(3000);

        while (true) {
            Socket accept = serverSocket.accept();
           new Thread(() -> {
               try (Socket accept2 = accept) // программа залипает пока не получит accept Теперь после подключения с ним можно работать
               {
                   serve(accept);
               } catch (ClassNotFoundException e) {
                   e.printStackTrace();
               } catch (IOException e) {
                   e.printStackTrace();
               }
           }).start();
        }

    } // end main

    private static void serve(Socket accept) throws IOException, ClassNotFoundException {
        InputStream inputStream = accept.getInputStream(); // источник для чтения
        OutputStream outputStream = accept.getOutputStream(); // цель для записи

        ObjectInputStream ois = new ObjectInputStream(inputStream); // читаем из серверного сокета объекты
        while (true) { // выход по исключению EOF
//                Object readObj = ois.readObject();
            Person readObj = (Person) ois.readObject();
            System.out.println(readObj);
        } // end while
    }
}
