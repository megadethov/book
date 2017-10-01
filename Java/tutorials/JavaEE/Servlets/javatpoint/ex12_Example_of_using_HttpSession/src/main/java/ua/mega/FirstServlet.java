package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.io.PrintWriter;

public class FirstServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        try {
            resp.setContentType("text/html");
            PrintWriter writer = resp.getWriter();

            String n = req.getParameter("userName");
            writer.println("Welcome " + n);

            HttpSession session = req.getSession();
            session.setAttribute("uname", n);

            writer.print("<br/><a href=\"servlet2\">visit</a>");

            writer.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
