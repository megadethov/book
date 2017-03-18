package ua.mega.streaming.commit_rollback;

//delete records with id = 106, 107 before you restart app again !!!!!!!!!!!!
/*
DELETE FROM employees WHERE id = 106;
DELETE FROM employees WHERE id = 107;
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

            //STEP 4: Set auto commit as false.
            conn.setAutoCommit(false);

            //STEP 5: Execute a query to create statment with
            // required arguments for RS example.
            System.out.println("Creating statement...");
            stmt = conn.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE, ResultSet.CONCUR_UPDATABLE);

            //STEP 6: INSERT a row into Employees table
            System.out.println("Inserting one row....");
            String sql = "INSERT INTO employees VALUES (106, 20, 'Rita', 'Tez')";
            stmt.executeUpdate(sql);

            //STEP 7: INSERT one more row into Employees table
            sql = "INSERT INTO employees VALUES (107, 22, 'Sita', 'Singh')";
            stmt.executeUpdate(sql);

            //STEP 8: Commit data here.
            System.out.println("Commiting data here....");
            conn.commit();

            //STEP 9: Now list all the available records.
            String sql2 = "SELECT id, first, last, age FROM employees";
            ResultSet rs = stmt.executeQuery(sql2);
            System.out.println("List result set for reference....");
            printRs(rs);

            //STEP 10: Clean-up environment
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
            // If there is an error then rollback the changes.
            System.out.println("Rolling back data here....");
            try {
                if (conn != null) {
                    conn.rollback();
                }
            } catch (SQLException se2) {
                se2.printStackTrace();
            }
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) {
                    stmt.close();
                }
            } catch (SQLException se3) {
                // NOP
            }
            try {
                if (conn != null) {
                    conn.close();
                }
            } catch (SQLException se4) {
                se4.printStackTrace();
            }
        }
    }

    private static void printRs(ResultSet rs) throws SQLException {
        //Ensure we start with first row
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

    }
}
