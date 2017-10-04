package se.lecture_07_IO;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class $ReadLine {
    public static void main(String[] args) {
        try (FileReader fr = new FileReader("src/se/content");
             BufferedReader br = new BufferedReader(fr)) {

           String str;
            while ((str = br.readLine()) != null) {
                System.out.println(str);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
