package se.lecture_07_IO.item_1;

import java.io.*;

public class MyReader {
    public static void main(String[] args) {
        // абсолютный путь файла - плохой стиль
//        File file = new File("d:\\java\\book\\OracleAcademy\\OracleAcademyKov\\src\\se\\lecture_07_IO\\item_1\\example.txt");
        // относительный путь файла
        File file = new File("src\\se\\lecture_07_IO\\item_1\\example.txt");

        // try with resources
        try (Reader reader = new FileReader(file)) { // ресурс закроется автоматически
            int val;
            while ((val = reader.read()) != -1) { // -1 конец данных в файле
                System.out.print((char) val);
            }
            // некоторые методы класса File
            System.out.println("file.getAbsolutePath(): ");
            System.out.println(file.getAbsolutePath()); // возвращает полный абсолютный путь к файлу
            System.out.println("============================================");
            System.out.println("file.getPath(): ");
            System.out.println(file.getPath()); // возвращает относительный путь к файлу

            // может бросить следующие checked Exception
        } catch (FileNotFoundException e) {
            System.out.println("Can not find current file");
        } catch (IOException e2) {
            System.out.println("error when processing file");
        }

    }
}
