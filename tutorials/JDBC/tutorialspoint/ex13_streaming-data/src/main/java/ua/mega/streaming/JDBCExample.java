package ua.mega.streaming;

import java.io.*;
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
        PreparedStatement pstmt = null;
        Statement stmt = null;
        ResultSet rs = null;
        try {
            // Register JDBC driver
            Class.forName(JDBC_DRIVER);

            // Open a connection
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            //Create a Statement object and build table
            stmt = conn.createStatement();
            createXMLTable(stmt);

            //Open a FileInputStream
//            File f = new File("d:\\java\\book\\tutorials\\JDBC\\tutorialspoint\\ex13_streaming-data\\XML_Data.xml");
            File f = new File(".\\ex13_streaming-data\\XML_Data.xml");
            long fileLength = f.length();
            FileInputStream fis = new FileInputStream(f);

            //Create PreparedStatement and stream data
            String SQL = "INSERT INTO XML_Data VALUES (?, ?)";
            pstmt = conn.prepareStatement(SQL);
            pstmt.setInt(1, 100);
            pstmt.setAsciiStream(2, fis, fileLength);
            pstmt.execute();

            //Close input stream
            fis.close();

            // Do a query to get the row
            SQL = "SELECT Data FROM XML_Data WHERE id = 100";
            rs = stmt.executeQuery(SQL);
            // Get the first row
            if (rs.next()) {
                //Retrieve data from input stream
                InputStream xmlInputStream = rs.getAsciiStream(1);
                int c;
                ByteArrayOutputStream bos = new ByteArrayOutputStream();
                while ((c = xmlInputStream.read()) != -1) {
                    bos.write(c);
                }
                //Print results
                System.out.println(bos.toString());
            }
            // Clean-up environment
        }catch(SQLException se){
            //Handle errors for JDBC
            se.printStackTrace();
        }catch(Exception e){
            //Handle errors for Class.forName
            e.printStackTrace();
        }finally{
            //finally block used to close resources
            try{
                if(stmt!=null)
                    stmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(pstmt!=null)
                    pstmt.close();
            }catch(SQLException se2){
            }// nothing we can do
            try{
                if(conn!=null)
                    conn.close();
            }catch(SQLException se){
                se.printStackTrace();
            }
        }
    }

    private static void createXMLTable(Statement stmt) {
        System.out.println("Creating XML_Data table...");
        //Create SQL Statement
        String streamingDataSQL = "CREATE TABLE XML_Data (id INTEGER, Data LONG)";
       try {
           //Drop table first if it exists.
           stmt.executeUpdate("DROP TABLE XML_Data");
       } catch (SQLException e) {
           // NOP
           e.printStackTrace();
       }
        //Build table
        try {
            stmt.executeUpdate(streamingDataSQL);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}
