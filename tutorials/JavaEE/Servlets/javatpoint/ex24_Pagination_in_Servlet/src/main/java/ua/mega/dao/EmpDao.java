package ua.mega.dao;

import ua.mega.beans.Emp;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class EmpDao {

    public static Connection getConnection(){
        Connection con = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            con = DriverManager.getConnection("jdbc:mysql://localhost/xe", "root", "root");
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return con;
    }

    public static List<Emp> getRecords(int start, int total){
        List<Emp> employees = new ArrayList<>();
        try {
            Connection con = getConnection();
            PreparedStatement ps = con.prepareStatement("SELECT * FROM test LIMIT " + (start - 1) + " ," + total);
            ResultSet rs = ps.executeQuery();

            while (rs.next()) {
                Emp emp = new Emp();
                emp.setId(rs.getInt("id"));
                emp.setName(rs.getString("name"));
                emp.setSalary(rs.getFloat("salary"));
                employees.add(emp);
            }
            con.close();
        } catch (Exception ex) {
            System.out.println(ex);
        }
        return employees;
    }

}
