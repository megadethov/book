package se.lecture_07_IO.item_3;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;
import java.util.Set;
import java.util.TreeSet;

public class Main {
    public static void main(String[] args) throws FileNotFoundException {
//        scannerReadConsole();
        scannerRead();
    }

    private static void scannerReadConsole() {
        Scanner in = new Scanner(System.in); // создаем сканнер на чтение консоли
        while (in.hasNext()) {
            System.out.println(in.next());
        }
    }

    private static void scannerRead() throws FileNotFoundException {
        // создаем TreeSet для извлечения в него слов из текста, без повторов и отсортированных
        Set<String> words = new TreeSet<>();
        String source = "src\\se\\lecture_07_IO\\item_3\\tokenizingEx.txt";

        try (Scanner tokenScanner = new Scanner(new FileReader(source))) { // Scanner для чтения файла - принимает FileReader
            tokenScanner.useDelimiter("\\W"); // все не буквы - использовать для деления

            while(tokenScanner.hasNext()) {
                String word = tokenScanner.next();
                if (!word.equals("")) { // если слово не пустота ""
                    words.add(word); // добавляем его в TreeSet
                }
            } // while
        } // try

        // вывод отобранных слов из TreeSet
        for (String s : words) {
            System.out.println(s);
        }
    }
}
