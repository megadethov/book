package full_guide.part_01.chapter_13._03_BufferedReader_String_readLine_toArr;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.Reader;

/**
 * Created by mega on 02.09.2016.
 */
// Простейший текстовый редактор
public class TextProc {
    public static void main(String[] args) throws IOException {
        String[] str = new String[100];
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Enter Line or (\"stop\" for exit:)");
        for (int i = 0; i < str.length; i++) {
            str[i] = in.readLine();
            if (str[i].equals("stop")) break;
        }
        System.out.println("Array content:");
        for (int i = 0; i < str.length; i++) {
            if (str[i].equals("stop")) break;
            System.out.println(str[i]);
        }
    }
}
