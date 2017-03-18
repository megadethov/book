package ua.mega;

import org.apache.commons.lang3.StringUtils;

import javax.servlet.*;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class AuthFilter implements Filter {

    private List<String> pathFilters = new ArrayList<>(Arrays.asList(new String[]{"add", "remove", "update", "result.jsp"}));

    @Override
    public void init(FilterConfig filterConfig) throws ServletException {

    }

    @Override
    public void doFilter(ServletRequest servletRequest, ServletResponse servletResponse, FilterChain filterChain) throws IOException, ServletException {
        String uri = ((HttpServletRequest) servletRequest).getRequestURI();
        String path = StringUtils.substringAfterLast(uri, "/");

        if (!pathFilters.contains(path)) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        HttpSession session = ((HttpServletRequest) servletRequest).getSession();
        User user = (User) session.getAttribute("PRINCIPAL");

        if (user != null) {
            filterChain.doFilter(servletRequest, servletResponse);
            return;
        }

        ((HttpServletResponse) servletResponse).sendRedirect("login.jsp?loginorpassword=invalid");

    }

    @Override
    public void destroy() {

    }
}
