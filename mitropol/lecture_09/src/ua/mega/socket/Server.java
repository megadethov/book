package ua.mega.socket;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) throws IOException {
        // сокет - это пара = домен+порт

        // Серверный сокет с портом 3000 (висит на нем и слушает), находится на локальной машине
        ServerSocket serverSocket = new ServerSocket(3000);

        // клиентский сокет подкл. к сокету Сервера (у клиента тоже открывается свой порт)
//        Socket socket = new Socket("localhost", 3000);

        Socket accept = serverSocket.accept(); // программа залипает пока не получит accept
        // Теперь после подключения с ним можно работать
        InputStream inputStream = accept.getInputStream(); // источник для чтения
        OutputStream outputStream = accept.getOutputStream(); // цель для записи

//        ObjectInputStream ois = new ObjectInputStream(inputStream); // читаем из серверного сокета

        BufferedReader br = new BufferedReader(new InputStreamReader(inputStream)); // читаем из серверного сокета
        for (int i = 0; i < 10; i++) {
            String str = br.readLine();
            System.out.println(str);
        }
        accept.close(); // закрытие сокета гарантированно закроет все IS-OS


    }
}
