package full_guide.part_01.chapter_18_Collections._28_Properties_DB;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.InputStreamReader;
import java.util.Properties;

/**
 * Created by mega on 10.09.2016.
 */
// Простая база телефонных номеров, построенная на Properties
public class PhoneBook {
    public static void main(String[] args) {

        Properties prop = new Properties();
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String name;
        String number;

        FileInputStream fin = null;
        boolean changed = false;

        // Попытаться открыть файл phonebook.dat
        // TODO: phone DB
    }
}
