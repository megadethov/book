package ua.mega.jdbc;

import ua.mega.jdbc.model.EmployeeDao2;
import ua.mega.jdbc.model.jdbc.JdbcEmployeeDao;
import ua.mega.jdbc.model.jdbc.JdbcEmployeeDao2;

public class Main {
    public static void main(String[] args) {
        JdbcEmployeeDao jdbcEmployeeDao = new JdbcEmployeeDao();
        EmployeeDao2 employeeDao2 = new JdbcEmployeeDao2();

        System.out.println("All employees:");
        jdbcEmployeeDao.getAll().forEach(System.out::println);

        System.out.println("Employee with id " + 3);
        System.out.println(employeeDao2.load(3));

    }
}