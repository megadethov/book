package ua.mega.streaming.jdbc;
/*
boolean execute(String SQL) :
Returns a boolean value of true if a ResultSet object
can be retrieved; otherwise, it returns false. Use this method to execute SQL DDL statements
or when you need to use the truly dynamic SQL.

int executeUpdate(String SQL):
Returns the number of rows affected by the execution
of the SQL statement. Use this method to execute SQL statements, for which you expect to get
a number of rows affected - for example, an INSERT, UPDATE, or DELETE statement.

ResultSet executeQuery(String SQL):
Returns a ResultSet object. Use this method when you
expect to get a result set, as you would with a SELECT statement.
 */

import java.sql.*;

public class JDBCExample_SE7 {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/emp";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        try (Connection conn = DriverManager.getConnection(DB_URL, USER, PASS);
        Statement stmt = conn.createStatement();) {

            Class.forName(JDBC_DRIVER);

            String sql = "UPDATE employees SET age=30 WHERE id=103";

            // Let us check if it returns a true Result Set or not
            Boolean ret = stmt.execute(sql);
            System.out.println("Return value is : " + ret);

            // Let us update age of the record with ID = 103;
            int rows = stmt.executeUpdate(sql);
            System.out.println("Rows impacted : " + rows);

            // Let us select all the records and display them
            sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", First: " + first);
                System.out.println(", Last: " + last);
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        }
        System.out.println("Goodbye!");
    } // end main
}
