package ua.mega.socket;

import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;

public class UdpClient {
    public static void main(String[] args) throws Exception {
        DatagramPacket datagramPacket = new DatagramPacket(new byte[256], 256);

        datagramPacket.setAddress(InetAddress.getByName("localhost"));
        datagramPacket.setPort(3000);

        DatagramSocket datagramSocket  = new DatagramSocket();
        datagramSocket.send(datagramPacket);


    }
}
