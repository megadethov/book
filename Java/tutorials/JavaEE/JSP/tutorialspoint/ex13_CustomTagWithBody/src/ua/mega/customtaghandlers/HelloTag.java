package ua.mega.customtaghandlers;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.tagext.SimpleTagSupport;
import java.io.IOException;
import java.io.StringWriter;

/**
 * Let us make following changes in above our tag code to process the body of the tag:
 */
public class HelloTag extends SimpleTagSupport {

    StringWriter sw = new StringWriter();

    @Override
    public void doTag() throws JspException, IOException {
        getJspBody().invoke(sw);
        getJspContext().getOut().println(sw.toString());

    }
}
