package ua.mega.customtaghandlers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * You can use various attributes along with your custom tags.
 * To accept an attribute value, a custom tag class needs
 * to implement setter methods, identical to JavaBean setter methods
 * as shown below:
 */
public class HelloTag extends SimpleTagSupport {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        if (message != null) {
            /* Use message from attribute */
            JspWriter writer = getJspContext().getOut();
            writer.println(message);
        } else {
            /* use message from the body */
            getJspBody().invoke(sw);
            getJspContext().getOut().println(sw.toString());
        }
    }
}
