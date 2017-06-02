package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class FetchData extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        try {
            //Retrieving connection object from ServletContext object
            ServletContext ctx = getServletContext();
            Connection con = (Connection) ctx.getAttribute("mycon");
            //retrieving data  from emp32 table
            PreparedStatement ps = con.prepareStatement("SELECT * FROM emp32", ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);

            ResultSet rs = ps.executeQuery();
            while (rs.next()) {
                writer.print("<br/>" + rs.getString(1) + " " + rs.getString(2));
            }
            con.close();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
