package ua.mega.Lecture_10.item_01;

import ua.mega.Lecture_10.MyConnection;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;

public class UserDDL {

    private static final String CREATE_USER_TABLE = "CREATE  TABLE  IF NOT EXISTS bookstore3 (id INT NOT NULL , name VARCHAR(45) NULL, PRIMARY KEY (id))";
    //    private static final String CREATE_USER_TABLE = "CREATE TABLE `test`.`bookstore2` (`bookstore2_id` INT NOT NULL,`bookstore2_name` VARCHAR(45) NULL, PRIMARY KEY (`bookstore2_id`))";
    private static final String UPDATE_USER_TABLE = "ALTER TABLE bookstore ADD year INTEGER";
    private static final String DROP_USER_TABLE = "DROP TABLE bookstore3";

    public static void main(String[] args) throws SQLException {
//        createTable(CREATE_USER_TABLE);
//        updateTable(UPDATE_USER_TABLE);
        dropTable(DROP_USER_TABLE);
    }

    public static void createTable(String createUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();

        Statement statement = connection.createStatement();
        statement.execute(createUserTable);
        statement.execute("commit");

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
    public static void updateTable(String updateUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        statement.execute(UPDATE_USER_TABLE);

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
    public static void dropTable(String dropUserTable) throws SQLException {
        Connection connection = MyConnection.createConnection();
        Statement statement = connection.createStatement();
        statement.execute(DROP_USER_TABLE);

        if (statement != null) statement.close();
        if (connection != null) connection.close();
    }
}
