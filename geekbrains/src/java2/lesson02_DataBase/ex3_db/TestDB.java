package java2.lesson02_DataBase.ex3_db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 * Created by mega on 11.09.2016.
 */
public class TestDB {
    private static Logger logger = LoggerFactory.getLogger(TestDB.class);
    static DbHelper dbHelper = DbHelper.getInstance();

    public static void main(String[] args) {
        selectExample();
        preparedStatementExample();
    }

    static void selectExample(){
        Statement stmt = null;
        ResultSet rs = null;
        StringBuilder result = new StringBuilder();
        try {
            stmt = dbHelper.getConn().createStatement();
            rs = stmt.executeQuery("SELECT * FROM CATEGORIES;");
            while (rs.next()) {
//                int id = rs.getInt(1);
//                String name = rs.getString(2);
                int id = rs.getInt("id");
                String name = rs.getString("name");
//                id = rs.getInt(rs.findColumn("id"));
//                result.append(id)
//                        .append(" ")
//                        .append(name)
//                        .append("\n");
                result.append(String.format("%d %s\n", id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            DbHelper.closeResource(rs);
            DbHelper.closeResource(stmt);
            DbHelper.closeConnection();
        }
        logger.info("categories: \n{}\n", result);
    }

    static void preparedStatementExample(){
        PreparedStatement stmt = null;
        ResultSet rs = null;
        StringBuilder result = new StringBuilder();
        try {
            stmt = dbHelper.getConn().prepareStatement("SELECT * FROM CATEGORIES WHERE ID=?");
            stmt.setInt(1, 2); // с 1 нумерация

            rs = stmt.executeQuery();
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                result.append(String.format("%d %s\n", id, name));
            }
        } catch (SQLException e) {
            e.printStackTrace();
        } finally {
//            DbHelper.closeResource(rs);
            DbHelper.closeResource(stmt);
            DbHelper.closeConnection();
        }
        logger.info("categories: \n{}\n", result);
    }
}
