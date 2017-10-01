package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.sql.*;

public class Search extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter out = resp.getWriter();

        String rollno = req.getParameter("roll");
        int roll = Integer.valueOf(rollno);

        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/xe", "root", "root");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM result WHERE rollno = ?");
            ps.setInt(1, roll);

            out.print("<table width=50% border=1>");
            out.print("<caption>Result:</caption>");

            ResultSet rs=ps.executeQuery();

            /* Printing column names */
            ResultSetMetaData rsMetaData = rs.getMetaData();
            int total = rsMetaData.getColumnCount();
            out.print("<tr>");
            for (int i = 1; i <= total; i++) {
                out.print("<th>"+rsMetaData.getColumnName(i)+"</th>");
            }
            out.print("</tr>");
            /* Printing result */
            while (rs.next()) {
                out.print("<tr><td>"+rs.getInt(1)+"</td><td>"+rs.getString(2)+"</td><td>"+rs.getString(3)+"</td><td>"+rs.getString(4)+"</td></tr>");
            }
            out.print("</table>");

        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            out.close();
        }
    }
}
