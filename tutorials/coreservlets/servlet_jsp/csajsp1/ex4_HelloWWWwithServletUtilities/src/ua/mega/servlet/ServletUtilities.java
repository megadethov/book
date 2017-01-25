package ua.mega.servlet;

/**
 * Some Simple HTML-Building Utilities
 */
public class ServletUtilities {
    public static final String DOCTYPE = "<!DOCTYPE HTML PUBLIC \"-//W3C//DTD HTML 4.0 Transitional//EN\">";

    public static String headWithTitle(String title) {
        return (DOCTYPE + "\n" +
                "<html>" +
                "<head>" +
                "<title>title</title>" +
                "</head>" +
                "<body>");
    }
}
/*
Don’t go overboard
        – Complete HTML generation packages
        usually work poorly
        – The JSP framework is a better solution*/
