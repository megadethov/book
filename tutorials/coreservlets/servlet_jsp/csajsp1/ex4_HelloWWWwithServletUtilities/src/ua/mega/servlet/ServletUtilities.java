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
                "</head>");
    }
    public static String filter(String input) {
        StringBuffer filtered = new StringBuffer(input.length());
        char c;
        for(int i=0; i<input.length(); i++) {
            c = input.charAt(i);
            if (c == '<') {
                filtered.append("&lt;");
            } else if (c == '>') {
                filtered.append("&gt;");
            } else if (c == '"') {
                filtered.append("&quot;");
            } else if (c == '&') {
                filtered.append("&amp;");
            } else {
                filtered.append(c);
            }
        }
        return(filtered.toString());
    }
}
/*
Don’t go overboard
        – Complete HTML generation packages
        usually work poorly
        – The JSP framework is a better solution*/
