package ua.mega.dispatcher;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class StartServlet extends DispatcherServlet {
    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        if (req.getParameter("enter") != null) super.forward("/myServlet", req, resp);
        else if (req.getParameter("register") != null) super.forward("/registration.jsp", req, resp);

    }
}
