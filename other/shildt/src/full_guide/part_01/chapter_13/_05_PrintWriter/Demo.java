package full_guide.part_01.chapter_13._05_PrintWriter;

import java.io.PrintWriter;

/**
 * Created by mega on 02.09.2016.
 */
// Продемонстрировать применение класса PrintWriter
public class Demo {
    public static void main(String[] args) {
        PrintWriter writer = new PrintWriter(System.out, true);
        writer.println("Hello");
        writer.println(10);
        writer.println(1.5e-5);
    }
}
