import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;
import java.time.LocalDateTime;

public class Main {
    public static void main(String[] args) {
        EmployeeDao employeeDao = new EmployeeDao();
        employeeDao.getAll().forEach(System.out::println);

    }
}