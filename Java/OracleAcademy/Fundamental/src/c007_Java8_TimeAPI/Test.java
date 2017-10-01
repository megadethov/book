package c007_Java8_TimeAPI;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Test {
    public static void main(String[] args) {

        LocalDateTime currentDateTime = LocalDateTime.now();
        System.out.println(currentDateTime); // 2017-10-01T17:21:08.163

        LocalDate currentDate = LocalDate.now();
        System.out.println(currentDate); // 2017-10-01

        LocalDate date = LocalDate.parse("2017-10-01");
        System.out.println(date);

    }
}
