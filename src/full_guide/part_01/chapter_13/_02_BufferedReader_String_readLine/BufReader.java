package full_guide.part_01.chapter_13._02_BufferedReader_String_readLine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by mega on 02.09.2016.
 */
// Чтение символьных строк с консоли средствами BufferedReader
public class BufReader {
    public static void main(String[] args) throws IOException {
        String str = "";
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter string or (\"stop\") for exit:");
        do {
            str = in.readLine();
            System.out.println(str);
        } while (!str.equals("stop")); // содержимое строк сравнивается ч\з equals
    }
}
