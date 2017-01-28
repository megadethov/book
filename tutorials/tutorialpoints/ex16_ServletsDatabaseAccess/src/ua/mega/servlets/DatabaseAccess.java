package ua.mega.servlets;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

/**
 * Accessing a Database
 * Here is an example which shows how to access TEST database using Servlet.
 */
public class DatabaseAccess extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        // JDBC driver name and database URL
        final String JDBC_DRIVER = "com.mysql.jdbc.Driver";
        final String DB_URL = "jdbc:mysql://localhost/TEST";

        //  Database credentials
        final String USER = "root";
        final String PASS = "root";

        // Set response content type
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();
        String title = "Database Result";
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        writer.println(docType +
                "<html>\n" +
                "<head><title>" + title + "</title></head>\n" +
                "<body bgcolor=\"#f0f0f0\">\n" +
                "<h1 align=\"center\">" + title + "</h1>\n");

        Connection conn = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // Execute SQL query
            stmt = conn.createStatement();
            String sql = "SELECT id, first, last, age FROM Employees";
            rs = stmt.executeQuery(sql);

            // Extract data from result set
            while (rs.next()) {
                //Retrieve by column name
                int id = rs.getInt("id");
                int age = rs.getInt("age");
                String first = rs.getString("first");
                String last = rs.getString("last");

                //Display values
                writer.print("ID: " + id);
                writer.print(", Age: " + age);
                writer.print(", First: " + first);
                writer.println(", Last: " + last + "<br>");
            }
            writer.println("</body></html>");

            // Clean-up environment
            rs.close();
            stmt.close();
            conn.close();
        } catch (SQLException se) {
            //Handle errors for JDBC
            se.printStackTrace();
        } catch (Exception e) {
            //Handle errors for Class.forName
            e.printStackTrace();
        } finally {
            //finally block used to close resources
            try {
                if (stmt != null) stmt.close();
            } catch (SQLException se2) {
                // NOP
            }
            try {
                if (conn != null) conn.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }
    }
}
