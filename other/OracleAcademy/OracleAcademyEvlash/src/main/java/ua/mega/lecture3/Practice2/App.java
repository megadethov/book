package ua.mega.lecture3.Practice2;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) throws IOException {
//        StringBuilder sb = Parser.readFile("src/main/resources/baby2008.html");
//        ArrayList<Baby> al = Parser.parcerForBaby(sb);
//        for (Baby b : al) {
//            System.out.println(b);
//        }
// TODO: problem with code page
       StringBuilder sb2 = Parser.readFile("src/main/resources/source.html");
        ArrayList<Notebook> al2 = Parser.parserNotebook(sb2);
        for (Notebook n : al2) {
            System.out.println(n);
        }

    }
}
