import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        EmployeeDao2 employeeDao2 = new EmployeeDao2();

        System.out.println("All employees:");
        employeeDao.getAll().forEach(System.out::println);

        System.out.println("Employee with id " + 3);
        System.out.println(employeeDao2.load(3));

    }
}