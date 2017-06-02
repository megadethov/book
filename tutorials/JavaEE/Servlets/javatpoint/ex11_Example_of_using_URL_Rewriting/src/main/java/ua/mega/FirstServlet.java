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

            //appending the username in the query string
            writer.print("<a href=\'servlet2?uname=" + n + "\'>visit</a>");

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
