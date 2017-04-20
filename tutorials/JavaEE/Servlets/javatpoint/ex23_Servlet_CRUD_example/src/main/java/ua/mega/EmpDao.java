package ua.mega;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

    public static Connection getConnection() {
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost:3306", "root", "root");
        } catch (Exception e) {
            System.out.println(e);
        }
        return con;
    }

    public static int save(Emp emp) {
        int status = 0;
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("INSERT INTO user905 (NAME, PASSWORD, EMAIL, COUNTRY) VALUES (?,?,?,?)");
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPassword());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getCountry());

            status = ps.executeUpdate();

            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return status;
    }

    public static int update(Emp emp) {
        int status = 0;

        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("UPDATE user905 SET NAME = ?, PASSWORD = ?, EMAIL = ?, COUNTRY = ? WHERE ID = ?");
            ps.setString(1, emp.getName());
            ps.setString(2, emp.getPassword());
            ps.setString(3, emp.getEmail());
            ps.setString(4, emp.getCountry());
            ps.setInt(5, emp.getId());

            status = ps.executeUpdate();
            con.close();

        } catch (SQLException e) {
            e.printStackTrace();
        }
        return status;
    }

    public static int delete(int id) {
        int status = 0;
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("DELETE FROM user905 WHERE ID = ?");
            ps.setInt(1, id);

            status = ps.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return status;
    }

    public static Emp getEmployeeById(int id) {
        Emp emp = new Emp();
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user905 WHERE ID = ?");
            ps.setInt(1, id);
            ResultSet rs = ps.executeQuery();
            if (rs.next()) {
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setPassword(rs.getString("password"));
                emp.setEmail(rs.getString("email"));
                emp.setCountry(rs.getString("country"));
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return emp;
    }

    public static List<Emp> getAllEmployees() {
        List<Emp> employees = new ArrayList<>();
        try {
            Connection con = EmpDao.getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM user905");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                Emp emp = new Emp();
                emp.setId(rs.getInt("ID"));
                emp.setName(rs.getString("NAME"));
                emp.setPassword(rs.getString("PASSWORD"));
                emp.setEmail(rs.getString("EMAIL"));
                emp.setCountry(rs.getString("COUNTRY"));
                employees.add(emp);
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return employees;
    }
}
