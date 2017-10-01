package ua.mega;

import com.sun.org.apache.xpath.internal.operations.String;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class DemoServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter writer = resp.getWriter();
        try {
            resp.setContentType("text/html");

            ServletContext context = getServletContext();
            context.setAttribute("company", "IBM");

            writer.println("Welcome to first servlet");
            writer.print("<a href='servlet2'>visit</a>");
            writer.close();
        } catch (Exception e) {
            writer.print(e);
        }
    }
}
