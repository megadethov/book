package ua.mega.jdbc2;

import ua.mega.jdbc2.model.EmployeeDao2;
import ua.mega.jdbc2.model.jdbc.JdbcEmployeeDao2;

public class Main {
    public static void main(String[] args) {

        EmployeeDao2 employeeDao2 = new JdbcEmployeeDao2();

        System.out.println("All employees:");
        employeeDao2.getAll().forEach(System.out::println);

        System.out.println("Employee with id " + 3);
        System.out.println(employeeDao2.load(3));

    }
}