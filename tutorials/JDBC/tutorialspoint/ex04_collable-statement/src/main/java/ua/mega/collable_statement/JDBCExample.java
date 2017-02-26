package ua.mega.collable_statement;

/*
Following is the example, which makes use of the CallableStatement along with the following getEmpName() MySQL stored procedure −
Make sure you have created this stored procedure in your EMP Database. You can use MySQL Query Browser to get it done.
 */

/*
DELIMITER $$

        DROP PROCEDURE IF EXISTS `EMP`.`getEmpName` $$
        CREATE PROCEDURE `EMP`.`getEmpName`
        (IN EMP_ID INT, OUT EMP_FIRST VARCHAR(255))
        BEGIN
        SELECT first INTO EMP_FIRST
        FROM Employees
        WHERE ID = EMP_ID;
        END $$

        DELIMITER ;
*/

//This sample code has been written based on the environment and database setup done in the previous chapters

//STEP 1. Import required packages

import java.sql.*;

public class JDBCExample {
    // JDBC driver name and database URL
    static final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
    static final String DB_URL = "jdbc:mysql://localhost/EMP";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "root";

    public static void main(String[] args) {

        Connection conn = null;
        CallableStatement stmt = null;
        try {
            //STEP 2: Register JDBC driver
            Class.forName("com.mysql.jdbc.Driver");

            //STEP 3: Open a connection
            System.out.println("Connecting to database...");
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //STEP 4: Execute a query
            System.out.println("Creating statement...");
            String sql = "{call getEmpName (?, ?)}";
            stmt = conn.prepareCall(sql);

            //Bind IN parameter first, then bind OUT parameter
            int empID = 102;
            stmt.setInt(1, empID); // This would set ID as 102
            // Because second parameter is OUT so register it
            stmt.registerOutParameter(2, Types.VARCHAR);

            //Use execute method to run stored procedure
            System.out.println("Executing stored procedure...");
            stmt.execute();

            //Retrieve employee name with getXXX method
            String empName = stmt.getString(2);
            System.out.println("Emp Name with ID:" +
                    empID + " is " + empName);


        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null)
                    stmt.close();
            } catch (SQLException se2) {
            }// nothing we can do
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
