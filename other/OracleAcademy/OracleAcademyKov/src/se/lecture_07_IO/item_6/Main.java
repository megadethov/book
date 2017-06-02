package se.lecture_07_IO.item_6;

import java.io.*;

import static se.lecture_07_IO.item_6.DataStreams.*;

public class Main {
    static String fileName = "src\\se\\lecture_07_IO\\item_6\\test.txt"; // берем пустой txt

    public static void main(String[] args) throws IOException {
        DataOutputStream out = new DataOutputStream(new FileOutputStream(new File(fileName)));
        DataInputStream in = new DataInputStream(new FileInputStream(new File(fileName)));

        write(out); // пишем данные из массивов в файл
        read(in); // вычитываем данные из файла
    }

    // метод для записи в файл примитивных типов
    public static void write(DataOutputStream out) throws IOException {
        for (int i = 0; i < 3; i++) { // в массивах по 3 элемента
            out.writeDouble(DOUBLES[i]);
            out.writeInt(INTS[i]);
            out.writeUTF(STRINGS[i]);
            out.writeBoolean(BOOLEAN[i]);
        }
    }

    // метод для чтения из файла примитивных типов
    public static void read(DataInputStream in) {
        // переменные для накопления суммы чисел массива
        double sumDouble = 0;
        int sumInt = 0;
        String sumString = "";
        try {
            while (true) { // читаем пока не вылетим по EOF
                // обязателен порядок чтения как в файле
                sumDouble += in.readDouble(); // вычитываем все double
                sumInt += in.readInt(); // вычитываем все int
                sumString += in.readUTF(); // вычитываем String, если он в UTF-8
                System.out.println(in.readBoolean()); // печатаем Boolean
            }
        } catch (EOFException e) {
            System.out.println("End of the file");
            System.out.println("Sum of the double = " + sumDouble);
            System.out.println("Sum of the int = " + sumInt);
            System.out.println("String concat = " + sumString);

        } catch (IOException e2) {
            e2.printStackTrace();
        }

    }
}

// класс с данными
class DataStreams {
    static final double[] DOUBLES = {1.1, 1.2, 1.3};
    static final int[] INTS = {1, 2, 3};
    static final String[] STRINGS = {"A", "B", "C"};
    static final boolean[] BOOLEAN = {true, true, false};
}
