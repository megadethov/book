package full_guide.part_01.chapter_13._01_BufferedReader_char_read;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mega on 02.09.2016.
 */
// Использовать класс BufferedReader для чтения символов с консоли
public class BufReader {
    public static void main(String[] args) {

        char c = 0; // переменная для считывания символов
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in)); // поток ввода
        System.out.println("Enter 1 char:");
        System.out.println("or q for quit.");
        do {
            try {
                c = (char) in.read();
                System.out.print(c);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } while (c != 'q');

    }
}
