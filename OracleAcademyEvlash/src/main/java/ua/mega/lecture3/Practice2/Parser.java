package ua.mega.lecture3.Practice2;

import java.io.*;
import java.util.ArrayList;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * Created by Yefremov Yuriy
 */
public class Parser {
    // метод для вычитывания страницы из файла
    public static StringBuilder readFile(String fileAddress) throws IOException {
        File file = new File(fileAddress);
        StringBuilder sb = new StringBuilder();
        try {
            BufferedReader br = new BufferedReader(new FileReader(file));
            String line;
            while ((line = br.readLine()) != null) {
                sb.append(line);
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return sb;
    }

    // метод для парсинга страницы baby
    public static ArrayList<Baby> parcerForBaby(StringBuilder sb) {
        ArrayList<Baby> babyList = new ArrayList<>();
        Pattern pattern = Pattern.compile("<td>(\\d+)</td><td>(.*?)</td><td>(.*?)</td>");
        Matcher matcher = pattern.matcher(sb.toString());
        while (matcher.find()) {
            String rank = matcher.group(1);
            String mailName = matcher.group(2);
            String femaleName = matcher.group(3);
            babyList.add(new Baby(Integer.parseInt(rank), mailName, femaleName));
        }
        return babyList;
    }

}
