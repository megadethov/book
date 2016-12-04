package ua.mega.Lecture_10_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MyConnection {

    private static String driverName = "com.mysql.jdbc.Driver"; // deprecated ?
//    private static String driverName = "com.mysql.cj.jdbc.Driver"; // new ?
    private static String url = "jdbc:mysql://localhost:3306/test"; // test - имя базы
    private static String user = "root";
    private static String password = "root";

    // первый способ создать connection
    public static Connection createConnection() {
        Connection conn = null;

        try {
            Class.forName(driverName); // загружаем драйвер в ClassPath
            // получаем от DriverManager - Connection
            conn = DriverManager.getConnection(url, user, password); // можно также указать в конструкторе properties
        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }

    // второй способ создать connection
    public static Connection createConnectionWay2() {
        Connection conn = null;
        try {
            DriverManager.registerDriver(new com.mysql.jdbc.Driver());
            conn = DriverManager.getConnection(url, user, password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return conn;
    }


    public static void main(String[] args) {
        Connection connection = createConnection();
        System.out.println("Connection is created");
    }
}
