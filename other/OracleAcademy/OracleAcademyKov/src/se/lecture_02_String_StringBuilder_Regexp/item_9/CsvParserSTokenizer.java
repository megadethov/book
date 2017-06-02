package se.lecture_02_String_StringBuilder_Regexp.item_9;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.StringTokenizer;

/**
 * Created by Yefremov Yuriy
 */
public class CsvParserSTokenizer {
    public static void main(String[] args) {
        BufferedReader br = null;

        try {
            String line;
            // ложим в BufferedReader наш файл
            br = new BufferedReader(new FileReader("d:\\java\\book\\OracleAcademy\\src\\se\\lecture_02_String_StringBuilder_Regexp\\item_9\\test.csv"));
            while ((line = br.readLine()) != null) { // построчное чтение
                System.out.println(line);

                StringTokenizer stringTokenizer = new StringTokenizer(line, "|"); // каждую стороку делим по указанному делиметру

                while (stringTokenizer.hasMoreElements()) {
                    // я заранее знаю структуру элементов в строке документа (int | String | int)
                    Integer id = Integer.parseInt(stringTokenizer.nextElement().toString()); // тк Integer парсит String, int -> toString
                    String userName = stringTokenizer.nextElement().toString(); // считали стринговый элемент
                    Integer code = Integer.parseInt(stringTokenizer.nextElement().toString()); // считали послдний эл-т в строке

                    // после того как мы вытащили все элементы одной строки, собираем их билдером
                    StringBuilder sb = new StringBuilder();
                    sb.append("\nId : " + id);
                    sb.append("\nUsername : " + userName);
                    sb.append("\nCode : " + code);
                    sb.append("\n****************\n");

                    System.out.println(sb); // печатаем распарсенную строку из билдера
                }
            }
            System.out.println("Done");
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                if (br != null) {
                    br.close();
                }
            } catch (IOException e2) {
                e2.printStackTrace();
            }
        }
    }
}
