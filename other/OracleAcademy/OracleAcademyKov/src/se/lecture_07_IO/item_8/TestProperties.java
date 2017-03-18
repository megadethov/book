package se.lecture_07_IO.item_8;

import java.io.*;
import java.util.Properties;

public class TestProperties {
    public static void main(String[] args) {

        String properties = "src\\se\\lecture_07_IO\\item_8\\example.properties";
        String newProperties = "src\\se\\lecture_07_IO\\item_8\\newexample.properties";


            readProperties(properties);
            writeProperties(newProperties);

    }

    public static void writeProperties(String path){
        Properties prop = new Properties(); // создаем properties
        OutputStream out = null;

        try {
            out = new FileOutputStream(new File(path)); // создаем поток для записи

            // сетим значения в properties
            prop.setProperty("key1", "value1000000");
            prop.setProperty("key2", "Value20000000");

            // store() - сохраняет properties
            prop.store(out, "my comment"); // пишем данные из properties в файл
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e2) {
            e2.printStackTrace();
        } finally {
            if (out != null) {
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }

    public static void readProperties(String path){
        Properties prop = new Properties();
        InputStream in = null;

        try {
            in = new FileInputStream(new File(path));

            // вычитывает данные из файла в properties
            prop.load(in);

            // вытаскиваем значения из properties по ключу
            String key1 = prop.getProperty("key1");
            String key2 = prop.getProperty("key2");

            System.out.println(key1);
            System.out.println(key2);
        } catch (FileNotFoundException e) {
            System.out.println("File not found");
        } catch (IOException e2) {
            e2.printStackTrace();
        } finally {
            if (in != null) {
                try {
                    in.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
