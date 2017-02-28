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

//STEP 1. Import required packages

import java.sql.*;

public class JDBCExample {

    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/emp";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        Connection conn = null;
        Statement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName(JDBC_DRIVER);

            //STEP 3: Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            stmt = conn.createStatement();
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

            //STEP 5: Extract data from result set
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

                //STEP 6: Clean-up environment
            }
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se2) {
                // NOP
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se3) {
                se3.printStackTrace();
            }
        } // end finally
        System.out.println("Goodbye!");
    } // end main
}
