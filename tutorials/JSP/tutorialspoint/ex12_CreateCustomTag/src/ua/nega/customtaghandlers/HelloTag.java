package ua.nega.customtaghandlers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;

/**
 * Consider you want to define a custom tag named <ex:Hello> and you want to use it in the following fashion without a body:
 * To create a custom JSP tag, you must first create a Java class that acts as a tag handler.
 * So let us create HelloTag class as follows:
 */
public class HelloTag extends SimpleTagSupport {
    @Override
    public void doTag() throws JspException, IOException {
        JspWriter writer = getJspContext().getOut();
        writer.println("Hello Custom Tag!");
    }
}
