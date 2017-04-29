package ua.mega;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;

public class CubeNumber extends TagSupport {
    private int number;

    public void setNumber(int number) {
        this.number = number;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            out.print(number * number * number);
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;
    }
}
