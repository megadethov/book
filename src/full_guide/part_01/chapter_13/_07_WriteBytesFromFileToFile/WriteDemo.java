package full_guide.part_01.chapter_13._07_WriteBytesFromFileToFile;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 * Created by mega on 02.09.2016.
 */
public class WriteDemo {
    public static void main(String[] args) {

        FileInputStream in = null;
        FileOutputStream out = null;
        try {
            in = new FileInputStream("d:\\java\\book\\doc.txt");
            out = new FileOutputStream("d:\\java\\book\\doc2.txt", true);

            while (true) {
                int result;
                    result = in.read();
                if (result == -1) break;
                    out.write(result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (out != null) out.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
            try {
                if (in != null) in.close();

            } catch (IOException e1) {
                e1.printStackTrace();
            }
        }
    }
}
