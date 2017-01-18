package ua.mega;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.Cookie;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        Cookie cookie = new Cookie("name1", "value1");
        Cookie cookie2 = new Cookie("name2", "value2");
        cookie.setMaxAge(360*24*60*60);
        cookie2.setMaxAge(360*24*60*60);
        resp.addCookie(cookie);
        resp.addCookie(cookie2);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/cookies.jsp");
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

    }
}
