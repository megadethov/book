package full_guide.part_01.chapter_13._09_TryWithResource_ReadWrite;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mega on 02.09.2016.
 */
public class Demo2 {
    public static void main(String[] args) throws IOException {
        try (FileInputStream in = new FileInputStream("d:\\java\\book\\doc.txt");
             FileOutputStream out = new FileOutputStream("d:\\java\\book\\doc2.txt")) {
            int res = 0;
            while (true) {
                res = in.read();
                if (res == -1) break;
                out.write(res);
            }
        }
    }
}
