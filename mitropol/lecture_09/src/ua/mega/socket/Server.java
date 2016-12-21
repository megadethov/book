package ua.mega.socket;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
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
        InputStream inputStream = accept.getInputStream();
        OutputStream outputStream = accept.getOutputStream();


    }
}
