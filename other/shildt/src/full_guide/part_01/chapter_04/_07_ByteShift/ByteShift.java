package full_guide.part_01.chapter_04._07_ByteShift;

/**
 * Created by mega on 22.08.2016.
 */
// Сдвиг влево значения типа byte
public class ByteShift {
    public static void main(String[] args) {
        byte a = 64, b;
        int i;

        i = a << 2;
        b = (byte) (a << 2); // cast отсекает старшие биты

        System.out.println("Первоначальное значение a: " + a);
        System.out.println("val and b:   " + i + " and " + b );
    }
    /*
    a продвигается сначала к int, а затем шифтуется на 2

    0000 0000 0000 0000 0000 0000 0100 0000
    0000 0000 0000 0000 0000 0001 0000 0000
    */


}
