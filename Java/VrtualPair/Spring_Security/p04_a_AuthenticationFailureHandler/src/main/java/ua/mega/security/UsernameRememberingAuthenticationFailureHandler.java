package ua.mega.security;

import org.springframework.security.core.AuthenticationException;
import org.springframework.security.web.authentication.AuthenticationFailureHandler;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

public class UsernameRememberingAuthenticationFailureHandler implements AuthenticationFailureHandler {
    @Override
    public void onAuthenticationFailure(HttpServletRequest request, HttpServletResponse response, AuthenticationException e) throws IOException, ServletException {

        // find out what the username was
        String username = request.getParameter("vppUsername");
        System.out.println(username);

        // redirect, to the url <context-root>/login.jsp?error&username=
        response.sendRedirect(request.getContextPath() + "/login.jsp?error&username=" + username);
    }
}
