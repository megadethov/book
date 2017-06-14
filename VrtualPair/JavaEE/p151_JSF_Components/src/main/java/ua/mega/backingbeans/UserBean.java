package ua.mega.backingbeans;

import javax.faces.bean.ManagedBean;
import java.util.Date;

@ManagedBean(name="user")
public class UserBean {
    private String name;

    private Date currentDate;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getCurrentDate() {
        return currentDate;
    }

    public void setCurrentDate(Date currentDate) {
        this.currentDate = currentDate;
    }

    public String greetUser() {
        currentDate = new Date();
        return "welcome";
    }
}
