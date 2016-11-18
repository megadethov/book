package ua.mega.lecture3.Practice2;

import java.io.IOException;
import java.util.ArrayList;

/**
 * Created by Yefremov Yuriy
 */
public class App {
    public static void main(String[] args) throws IOException {
        StringBuilder sb = Parser.readFile("src/main/resources/baby2008.html");
        ArrayList<Baby> al = Parser.parcerForBaby(sb);
        for (Baby b : al) {
            System.out.println(b);
        }
    }
}
