package db.lesson_12_connectSQLiteJDBC;

import java.sql.*;

/**
 * Created by mega on 19.09.2016.
 */
public class TestJDBC {
    public static void main(String[] args) {
        Connection con = null; // хранит соединение с базой данных
        Statement stmt = null; // хранит и выполняет SQL запросы
        ResultSet res = null; // получает результаты выполнения SQL запросов

        try {
            // динамическая регистрация драйвера SQLite
            Driver driver = (Driver) Class.forName("org.sqlite.JDBC").newInstance();
//            DriverManager.registerDriver(driver);

            // Создание подключения к базе данных попути указанному в url
            String url = "jdbc:sqlite:d:/java/book/batr/src/db/CarShop_lesson10.db";
            con = DriverManager.getConnection(url);

            // Подготовка SQL запроса
            String sql = "SELECT * FROM spr_Model";
            stmt = con.createStatement();

            // Выполнение SQL запроса
            res = stmt.executeQuery(sql);

            // Обработка результатов
            while (res.next()) {
                System.out.println(res.getString("name_ru") + " - " + res.getObject("name_en"));
            }


        } catch (SQLException e) {
            e.printStackTrace();
        } catch (Exception e2) {
            e2.printStackTrace();
        } finally {
           try {
               if (res != null) res.close();
               if (stmt != null) stmt.close();
               if (con != null) con.close();
           } catch (Exception e3) {
               // NOP
           }
        }

    }
}
