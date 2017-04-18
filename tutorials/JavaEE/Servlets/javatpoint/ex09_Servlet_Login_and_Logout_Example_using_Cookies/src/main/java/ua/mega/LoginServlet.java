package ua.mega;

import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class LoginServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html");
        PrintWriter writer = resp.getWriter();

        req.getRequestDispatcher("link.html").include(req, resp);

        String userName = req.getParameter("userName");
        System.out.println("LoginServlet = " + userName);
        String password = req.getParameter("password");

        if (password.equals("admin")) {
            writer.print("<br>You are successfully logged in!");
            writer.print("<br/>Welcome " + userName);

            Cookie ck = new Cookie("name", userName);
            resp.addCookie(ck);
        } else {
            writer.print("<br>sorry, username or password error!");
            req.getRequestDispatcher("login.html").include(req, resp);
        }
        writer.close();
    }
}
