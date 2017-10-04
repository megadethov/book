package se.lecture_07_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class $BufferedReader {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/se/content");
             BufferedReader br = new BufferedReader(fr)) {

            int ch;
            while ((ch = br.read()) != -1) {
                System.out.println((char) ch);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
