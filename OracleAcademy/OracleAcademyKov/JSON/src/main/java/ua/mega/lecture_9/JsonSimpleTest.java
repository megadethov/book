package ua.mega.lecture_9;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;
import org.json.simple.parser.ParseException;

import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Iterator;

public class JsonSimpleTest {
    static String filePath = "JSON\\src\\main\\java\\ua\\mega\\lecture_9\\jsonEx.json";

    public static void main(String[] args) {
        writeJson();
//        readJson();
    }

    public static void writeJson() {
        JSONObject obj = new JSONObject();
        obj.put("name", "Karl");
        obj.put("age", 25);

        JSONArray list = new JSONArray();
        list.add("msg1");
        list.add("msg2");
        list.add("msg3");

        obj.put("messages", list);

        try (FileWriter out = new FileWriter(filePath)) {
            out.write(obj.toJSONString());
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(obj);
    }

    public static void readJson() {
        JSONParser parser = new JSONParser();
        try (FileReader in = new FileReader(filePath)) {
            Object obj = parser.parse(in); // парсим файл и складываем в Object
            JSONObject jsonObject = (JSONObject) obj; // приводим к JSON Object

            // вытаскиваем поля
            String name = (String) jsonObject.get("name");
            long age = (Long) jsonObject.get("age");
            System.out.println("name = " + name);
            System.out.println("age = " + age);

            // Теперь нужен итератор, чтобы вытащить массив сообщений
            JSONArray msg = (JSONArray) jsonObject.get("messages");
            Iterator<String> iter = msg.iterator();

            while (iter.hasNext()) {
                System.out.println(iter.next());
            }


        } catch (IOException e) {
            e.printStackTrace();
        } catch (ParseException e2) {
            e2.printStackTrace();
        }
    }
}
