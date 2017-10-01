package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class Register extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String n=req.getParameter("userName");
        String p=req.getParameter("userPass");
        String e=req.getParameter("userEmail");
        String c=req.getParameter("userCountry");

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/xe", "root", "root");
            PreparedStatement ps = con.prepareStatement("INSERT INTO user905 (NAME, PASSWORD, EMAIL, COUNTRY) VALUES (?,?,?,?)");
            ps.setString(1, n);
            ps.setString(2, p);
            ps.setString(3, e);
            ps.setString(4, c);

            int i = ps.executeUpdate();
            if (i > 0) {
                out.print("You are successfully registered...");
            } else {
                out.print("Unable to register...");
            }
            out.close();
        } catch (Exception ex) {
            ex.printStackTrace();
        }
    }
}
