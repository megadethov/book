package ua.mega.nio;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;

public class NIO {
    public static void main(String[] args) throws Exception {
        ByteBuffer buffer = ByteBuffer.allocate(12); // обертка над массивом
        buffer.put("12345".getBytes("cp1251"));

//        System.out.println(buffer.limit()); // 12
//        System.out.println(buffer.position()); // 9
//        buffer.limit(9);
//        buffer.position(0);
        buffer.flip();

        buffer.get();
        buffer.get();
        buffer.get();

        System.out.println(buffer); // java.nio.HeapByteBuffer[pos=3 lim=5 cap=12]


    }

}
