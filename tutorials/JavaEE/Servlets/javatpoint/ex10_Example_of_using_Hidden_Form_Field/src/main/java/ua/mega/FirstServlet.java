package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        try {
            String n = req.getParameter("userName");
            writer.print("Welcome " + n);

            //creating form that have invisible textfield
            writer.print("<form action='servlet2'>");
            writer.print("<input type='hidden' name='uname' value='" + n + "'>");
            writer.print("<input type='submit' value='go'>");
            writer.print("</form>");
            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
