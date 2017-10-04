package se.lecture_07_IO;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class $FileReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/se/content")) {
            int ch;
            while ((ch = fr.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
