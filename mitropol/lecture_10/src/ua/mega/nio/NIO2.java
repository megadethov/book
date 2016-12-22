package ua.mega.nio;

import java.io.IOException;
import java.net.InetSocketAddress;
import java.net.ServerSocket;
import java.nio.ByteBuffer;
import java.nio.channels.SelectionKey;
import java.nio.channels.Selector;
import java.nio.channels.ServerSocketChannel;
import java.nio.channels.SocketChannel;

public class NIO2 {
    public static void main(String[] args) throws IOException {
        // Один селектор в состоянии обслуживать много каналов, к-ые на него подписываются
        // Селектор исключает холостую работу каналов
        Selector selector = Selector.open();

        SocketChannel channel;
        ByteBuffer buffer;

        try (ServerSocketChannel ssc = ServerSocketChannel.open()) {
            ssc.bind(new InetSocketAddress(3000));

            ssc.configureBlocking(false);
            ssc.register(selector, SelectionKey.OP_ACCEPT); // зарегистрирован канал на селекторе


            buffer = ByteBuffer.allocate(1024 * 1024);

            while (true) {

                // TODO:


                channel = ssc.accept();
                channel.configureBlocking(false); // не блокирующий режим

                channel.read(buffer);
                buffer.flip();
                System.out.println(new String(buffer.array(), buffer.position(), buffer.remaining()));
                buffer.clear();

            }
        }

    }
}
