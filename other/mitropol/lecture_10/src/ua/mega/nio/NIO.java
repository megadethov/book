package ua.mega.nio;

import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.IntBuffer;
import java.util.Arrays;

public class NIO {
    public static void main(String[] args) throws Exception {
        // обертка над массивом
        ByteBuffer buffer = ByteBuffer.allocate(12); // в пространстве вашего приложения (если часто создается и удаляется)
//        ByteBuffer buffer = ByteBuffer.allocateDirect(12); // в пространстве ОС (типа меньше всяких попутных буферов на пути к файловой состеме)
//        buffer.put("12345".getBytes("cp1251")); // возвращается этот же буфер, что позволяет делать цепочки методов

//        System.out.println(buffer.limit()); // 12
//        System.out.println(buffer.position()); // 9
//        buffer.limit(9);
//        buffer.position(0);
//        buffer.flip(); // перевод в режим чтения

//        buffer.get(); // считывает 1 байт из буфера
//        buffer.get();
//        buffer.get();

//        System.out.println(buffer); // java.nio.HeapByteBuffer[pos=3 lim=5 cap=12]
//        buffer.compact(); // перемещает недочитанные данные в начало
//        System.out.println(buffer); // java.nio.HeapByteBuffer[pos=2 lim=12 cap=12]

//        buffer.clear(); // пишем поверх старых данных

//        buffer = ByteBuffer.allocate(12).order(ByteOrder.BIG_ENDIAN); // по дефолту - Старший разряд слева
        buffer = ByteBuffer.allocate(12).order(ByteOrder.LITTLE_ENDIAN); // Старший разряд справа

        System.out.println(Arrays.toString(buffer.putInt(1).array())); // [0, 0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0]
//        System.out.println(Arrays.toString(buffer.putInt(100).array())); // [0, 0, 0, 100, 0, 0, 0, 0, 0, 0, 0, 0]
//        System.out.println(Arrays.toString(buffer.putInt(256).array())); // [0, 0, 1, 0, 0, 0, 0, 0, 0, 0, 0, 0]
//        System.out.println(Arrays.toString(buffer.putInt(Integer.MAX_VALUE).array())); // [127, -1, -1, -1, 0, 0, 0, 0, 0, 0, 0, 0]

        // аналог обычного массива интов для работы с интами, отличие в том, что индекс как в массиве по ячейкам
        IntBuffer intB = buffer.asIntBuffer();





    }

}
