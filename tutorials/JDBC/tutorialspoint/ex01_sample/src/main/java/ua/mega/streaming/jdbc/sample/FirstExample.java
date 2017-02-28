package ua.mega.streaming.jdbc.sample;

import java.sql.*;
import java.util.Properties;

import static java.awt.SystemColor.info;

public class FirstExample {

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

            //STEP 3: Open a conn
            System.out.println("Connection to DB ...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 3: Open a conn - Properties
           /* Properties credentials = new Properties();
            credentials.put("user", USER);
            credentials.put("password", PASS);
            conn = DriverManager.getConnection(DB_URL, credentials);*/

            //STEP 4: Execute a query
            System.out.println("Creating stmt...");
            stmt = conn.createStatement();
            String sql = "SELECT id, first, last, age FROM Employees";
            ResultSet rs = stmt.executeQuery(sql);

            //STEP 5: Extract data from result set
            while (rs.next()) {
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

            //STEP 6: Clean-up environment
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
                //NOP
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se3) {
                se3.printStackTrace();
            }
            System.out.println("Goodbye!");
        } // end finally
    } // end main
}
