package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.sql.*;
import java.util.ArrayList;

public class MyListener implements ServletContextListener {
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ArrayList<User> users = new ArrayList<>();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/xe", "root", "root");

            PreparedStatement ps = con.prepareStatement("select * from user905");
            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                User u = new User();
                u.setId(rs.getInt("CSUSER_ID"));
                u.setName(rs.getString("USER_NAME"));
                u.setPassword(rs.getString("USER_PASS"));
                users.add(u);
            }
            con.close();

        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        } catch (SQLException e) {
            e.printStackTrace();
        }

        //storing the ArrayList object in ServletContext
        ServletContext ctx = sce.getServletContext();
        ctx.setAttribute("data", users);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {
        System.out.println("project undeployed...");
    }
}
