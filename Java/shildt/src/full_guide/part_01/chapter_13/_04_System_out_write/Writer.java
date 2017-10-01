package full_guide.part_01.chapter_13._04_System_out_write;

/**
 * Created by mega on 02.09.2016.
 */
// Продемонстрировать применение System.out.write() (пишет 1 байт)
public class Writer {
    public static void main(String[] args) {
        int b = 'A';
//        System.out.write("Not works");
        System.out.write(b);
        System.out.write('\n'); // без перевода на новую строку не выводит на консоль
    }
}
