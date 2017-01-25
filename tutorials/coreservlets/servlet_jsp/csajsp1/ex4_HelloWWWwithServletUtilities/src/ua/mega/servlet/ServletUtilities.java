package ua.mega.servlet;

/**
 * Created by mega
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
