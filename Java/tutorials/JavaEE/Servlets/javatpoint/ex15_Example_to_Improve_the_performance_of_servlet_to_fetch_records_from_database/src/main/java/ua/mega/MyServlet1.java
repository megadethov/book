package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Iterator;
import java.util.List;

public class MyServlet1 extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        long before = System.currentTimeMillis();

        ServletContext ctx = getServletContext();
        List<User> users = (List<User>) ctx.getAttribute("data");

        Iterator<User> iter = users.iterator();
        while (iter.hasNext()) {
            User u = iter.next();
            writer.print("<br/>" + u.getId() + " " + u.getName() + " " + u.getPassword());
        }
        long after = System.currentTimeMillis();
        writer.print("<br/>total time: " + (after - before));

        writer.close();

    }
}
