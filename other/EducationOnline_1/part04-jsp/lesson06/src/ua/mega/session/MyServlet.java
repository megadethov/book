package ua.mega.session;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class MyServlet extends HttpServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        HttpSession session = req.getSession();
        String str = req.getParameter("textinput");
        session.setAttribute("servlSession", str);

        RequestDispatcher dispatcher = req.getRequestDispatcher("/showsession.jsp");
        dispatcher.forward(req, resp);
    }
}
