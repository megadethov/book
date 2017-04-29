package ua.mega;

import javax.servlet.jsp.JspException;
import javax.servlet.jsp.JspWriter;
import javax.servlet.jsp.tagext.TagSupport;
import java.sql.*;

public class PrintRecord extends TagSupport {

    private String id;
    private String table;

    @Override
    public void setId(String id) {
        this.id = id;
    }

    public void setTable(String table) {
        this.table = table;
    }

    @Override
    public int doStartTag() throws JspException {
        JspWriter out = pageContext.getOut();
        try {
            Class.forName("com.mysql.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost/xe", "root", "root");
            PreparedStatement ps = con.prepareStatement("SELECT * FROM " + table + " WHERE id = ?");
            ps.setInt(1, Integer.parseInt(id));
            ResultSet rs = ps.executeQuery();

            if (rs != null) {
                ResultSetMetaData metaData = rs.getMetaData();
                int totalCols = metaData.getColumnCount();
                //column name
                out.write("<table border='1'>");
                out.write("<tr>");
                for (int i = 1; i <= totalCols; i++) {
                    out.write("<th>" + metaData.getColumnName(i) + "</th>");
                }
                out.write("</tr>");
                //column value
                if (rs.next()) {
                    out.write("<tr>");
                    for (int i = 1; i <= totalCols; i++) {
                        out.write("<td>" + rs.getString(i) + "</td>");
                    }
                    out.write("</tr>");

                } else {
                    out.write("Table or Id doesn't exist");
                }
                out.write("</table>");

            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
        return SKIP_BODY;
    }
}
