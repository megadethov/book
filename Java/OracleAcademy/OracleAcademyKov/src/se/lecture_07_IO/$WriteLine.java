package se.lecture_07_IO;

import java.io.*;

public class $WriteLine {
    public static void main(String[] args) {
        try (BufferedReader br = new BufferedReader(new FileReader("src/se/content"));
             BufferedWriter bw = new BufferedWriter(new PrintWriter("src/se/dist"))) {

           String str;
            while ((str = br.readLine()) != null) {
//                bw.flush();
                bw.write(str);
                bw.newLine();
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
