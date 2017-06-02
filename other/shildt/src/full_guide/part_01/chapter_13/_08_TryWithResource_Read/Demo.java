package full_guide.part_01.chapter_13._08_TryWithResource_Read;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;

/**
 * Created by mega on 02.09.2016.
 */
// try with resources для автозакрытия (since JDK 7)
public class Demo {
    public static void main(String[] args) {
        try (FileInputStream in = new FileInputStream("d:\\java\\book\\doc.txt")) {
            int result = 0;
            while (true) {
                result = in.read();
                if (result != -1) {
                    System.out.print((char) result);
                } else break;
            }
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e1) {
            e1.printStackTrace();
        }
    }
}
