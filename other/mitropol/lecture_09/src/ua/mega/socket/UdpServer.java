package ua.mega.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.SocketException;

// TCP - рабодает с потоками
// UDP - работает с пакетами (Datagram)

public class UdpServer {
    public static void main(String[] args) throws Exception {
        DatagramSocket datagramSocket = new DatagramSocket(3000);
        DatagramPacket datagramPacket = new DatagramPacket(new byte[256], 256);
       while (true) {
           datagramSocket.receive(datagramPacket);
           datagramPacket.getAddress();
           int length = datagramPacket.getLength();
           String s = new String(datagramPacket.getData(), 0, length);
           System.out.println("s = " + s);
       }
    }
}
