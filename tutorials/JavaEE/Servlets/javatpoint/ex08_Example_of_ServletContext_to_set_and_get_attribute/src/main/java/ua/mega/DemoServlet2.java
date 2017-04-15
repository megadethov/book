package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet2 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();

        try {
            resp.setContentType("text/html");

            ServletContext context = getServletContext();
            String name = (String) context.getAttribute("company");

            out.print("Welcome to: " + name);
            out.close();
        } catch (Exception e) {
            out.print(e);
        }
    }
}
