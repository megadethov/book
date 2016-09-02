package full_guide.part_01.chapter_13._06_ReadBytesFromFile;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * Created by mega on 02.09.2016.
 */
// Прочитать данные из файла и вывести на консоль (моя версия)
public class ReadTest {
    public static void main(String[] args) {
        FileInputStream input = null; // вынесено из try, чобы был доступ из finally
        try {
            input = new FileInputStream("d:\\java\\book\\doc.txt");
            int result = 0;
            while (true) {
                result = input.read();
                if (result == -1) break;
                System.out.print((char) result);
            }
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (input != null) // обязательно проверить на null
                input.close();
            } catch (IOException e) {
                System.err.println("Close not done");
            }
        }
    }
}
