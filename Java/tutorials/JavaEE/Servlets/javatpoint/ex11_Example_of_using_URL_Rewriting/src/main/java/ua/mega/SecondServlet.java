package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class SecondServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/http");
        PrintWriter writer = resp.getWriter();

        try {
            //getting value from the query string
            String n = req.getParameter("uname");
            writer.print("Hello " + n);

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
