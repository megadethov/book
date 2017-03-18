package ua.mega.servlet;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class MyServlet extends HttpServlet {

    private Integer status;

    @Override
    public void init() throws ServletException {
        System.out.println("init MyServlet");
        status = Integer.valueOf(getServletConfig().getInitParameter("name1"));
        System.out.println("Status: " + status);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("servlet dispatch");
//        System.out.println("context-param " + req.getSession().getServletContext().getInitParameter("contextName1"));
        System.out.println("context-param " + getServletContext().getInitParameter("contextName1"));
        req.getRequestDispatcher("home.jsp").forward(req, resp);
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        doGet(req, resp);
    }
}
