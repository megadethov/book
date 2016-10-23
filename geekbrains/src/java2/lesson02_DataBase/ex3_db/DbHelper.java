package java2.lesson02_DataBase.ex3_db;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.sql.*;

/**
 * Created by mega on 11.09.2016.
 */
public class DbHelper {
    private static Logger logger = LoggerFactory.getLogger(DbHelper.class);
    private static Connection conn;
    private static DbHelper instance;
    private static String databaseUrl = "jdbc:sqlite:testdb.sqlite";

    static Connection[] connections;

    public static DbHelper getInstance() {
        if (instance == null) {
            instance = new DbHelper();
        }
        return instance;
    }

    private DbHelper() {
        try {

// без https://bitbucket.org/xerial/sqlite-jdbc/downloads
//будет java.lang.ClassNotFoundException: org.sqlite.JDBC

            Class.forName("org.sqlite.JDBC"); // загружаем драйвер в память
//            DriverManager.registerDriver(new org.sqlite.JDBC()); // альтернативный способ загрузки
            logger.info("Opening database: {}", databaseUrl);

            conn = DriverManager.getConnection(databaseUrl);

//            // example overflow connections
//            connections = new Connection[1000];
//            for (int i = 0; i < connections.length; i++) {
//                connections[i] = DriverManager.getConnection(databaseUrl);
//            }

            if (!isTablesExist()) {
                Statement stmt = conn.createStatement();
                String createSql = readResource(DbHelper.class, "create.sql");
                stmt.executeUpdate(createSql);

                String insertSql = readResource(DbHelper.class, "insert.sql");
                stmt.executeUpdate(insertSql);
                stmt.close();
            }
        } catch (Exception e) {
            e.printStackTrace();
            System.exit(0);
        } finally {
            closeConnection();
        }
    }

    public Connection getConn() {
        if (conn == null) {
            try {
                conn = DriverManager.getConnection(databaseUrl);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
        return conn;
    }

    boolean isTablesExist() throws Exception {
        Statement stmt = conn.createStatement();
        ResultSet rs = stmt.executeQuery("SELECT count(*) FROM sqlite_master WHERE type='table' AND name='USERS';");
        boolean result = true;
        int count = rs.getInt(1);
        if (count == 0) {
            result = false;
        }
        rs.close();
        stmt.close();
        return result;
    }

    String readResource(Class cpHolder, String path) throws Exception {
        java.net.URL url = cpHolder.getResource(path);
        java.nio.file.Path resPath = java.nio.file.Paths.get(url.toURI());
        return new String(java.nio.file.Files.readAllBytes(resPath), "UTF8");
    }

    static void closeResource(AutoCloseable res) {
        try {
            if (res != null) {
                res.close();
                res = null;
            }
        } catch (Exception e) {
            logger.warn("Failed to close resource: {}", res);
        }
    }

    static void closeConnection(){
        closeResource(conn);
        conn = null;
    }
}


// http://www.codejava.net/java-se/jdbc/connect-to-sqlite-via-jdbc
// http://stackoverflow.com/questions/6740601/what-does-class-fornameorg-sqlite-jdbc-do


// http://docs.oracle.com/javase/6/docs/api/java/sql/ResultSet.html
/*
Хорошей практикой после использования Connection, Statement или ResultSet их закрывать. ResultSet нет нужды закрывать явно, потому что после закрытия Statement он закроется автоматически (A ResultSet object is automatically closed when the Statement object that generated it is closed, re-executed, or used to retrieve the next result from a sequence of multiple results. http://docs.oracle.com/javase/6/docs/api/java/sql/ResultSet.html). То есть достаточно закрыть два Connection и Statment.
*/

/*
http://javatalks.ru/topics/37376
Вообще-то спецификация jdbc в пункте 13.1.4 Closing Statement Objects предписывает драйверам автоматически при закрытиии соединения также закрывать Statement
Quote:

All Statement objects will be closed when the connection that created them is closed
 */
