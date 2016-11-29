package se.lecture_07_IO.item_4;

import java.io.*;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        File file = new File("src\\se\\lecture_07_IO\\item_4\\Child.class");
//        File file = new File("src\\se\\lecture_07_IO\\item_4\\Child.pdf"); // class file с расширением .pdf
        File file = new File("src\\se\\lecture_07_IO\\item_4\\simple.txt");

        // массив из 4 байтов, представляющих начало любого .class файла - тн магическое число
        byte[] classIdentifier = {(byte) 0xCA, (byte) 0xFE, (byte) 0xBA, (byte) 0xBE}; // нужно явно приводить, тк литералы - int

        try (InputStream inputStream = new FileInputStream(file)) { // создаем FileInputStream для чтения байтов из файла
            byte[] buffer = new byte[4]; // создадим byte массив на 4 байта, в к-ый будем читать из файла

            if (inputStream.read(buffer) != -1) { // читаем 4 байта в buffer
                if (Arrays.equals(classIdentifier, buffer)) {
                    System.out.println("This file has .class extension");
                } else {
                    System.out.println("This is not a .class file");
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e2) {
            e2.printStackTrace();
        }
    }
}
