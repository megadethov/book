package se.lecture_07_IO.item_5;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        File file = new File("src\\se\\lecture_07_IO\\item_5\\Child.class");

        int extension = 0xCAFEBABE; // магическое число определяющее начало .class файла

        // для соединения DataInputStream с File используем FileInputStream
        // это работает потому, что оба являются InputStream
        try (DataInputStream inputStream = new DataInputStream(new FileInputStream(file))) {
            while (true) { // читаем данные из файла, пока не упадем по EOFException
                int i = inputStream.readInt(); // считываем инты из файла в переменную i, до тех пор пока не найдем магический инт
                // или закончится файл
                if(i == extension) {
                    System.out.println("This is a .class extension");
                }
            }
        } catch (EOFException e) { // этот Exception выводит из цикла
            System.out.println("End of the file");
        } catch (FileNotFoundException e2) {
            System.out.println("File not found");
        } catch (IOException e3) {
            e3.printStackTrace();
        }
    }
}
