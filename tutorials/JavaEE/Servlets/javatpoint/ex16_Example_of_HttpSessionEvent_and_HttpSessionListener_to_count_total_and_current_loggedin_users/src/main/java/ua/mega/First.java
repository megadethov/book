package ua.mega;

import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class First extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        String n = req.getParameter("username");
        writer.print("Welcome " + n);

        HttpSession session = req.getSession();
        session.setAttribute("uname", n);

        //retrieving data from ServletContext object
        ServletContext ctx = getServletContext();
        int t = (int) ctx.getAttribute("totalusers");
        int c = (int) ctx.getAttribute("currentusers");

        writer.print("<br/>total users = " + t);
        writer.print("<br/>current users = " + c);

        writer.print("<br/><a href='logout'>logout</a>");

        writer.close();
    }
}
