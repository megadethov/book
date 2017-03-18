package ua.mega.lecture2.Practice1.item5;

/**
 * Created by Yefremov Yuriy
 */
public class Group {

    private String name;
    private String course;
    private String department;

    public Group(String name, String course, String department) {
        this.name = name;
        this.course = course;
        this.department = department;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    @Override
    public String toString() {
        return "Group{" +
                "name='" + name + '\'' +
                ", course='" + course + '\'' +
                ", department='" + department + '\'' +
                '}';
    }
}
