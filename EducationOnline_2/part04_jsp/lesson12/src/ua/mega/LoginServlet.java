package ua.mega;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;

public class LoginServlet extends HttpServlet {
    private UserDataSource userDataSource;

    public LoginServlet() {
        userDataSource = new UserDataSource();
    }


    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {

        HttpSession session = req.getSession();

        String username = req.getParameter("username");
        String password = req.getParameter("password");

        User user = userDataSource.getUserByUsernameAndPassword(username, password);
        if (user != null) {
            session.setAttribute("PRINCIPAL", user);
            RequestDispatcher dispatcher = req.getRequestDispatcher("/result.jsp");
            dispatcher.forward(req, resp);
            return;
        }
        resp.sendRedirect("login.jsp?loginorpassword=invalid");
    }
}
