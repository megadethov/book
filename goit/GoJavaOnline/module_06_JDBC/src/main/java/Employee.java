import java.time.LocalDateTime;

public class Employee {
    private int id;
    private String name;
    private int age;
    private String address;
    private float salary;
    private LocalDateTime join_date;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    public LocalDateTime getJoin_date() {
        return join_date;
    }

    public void setJoin_date(LocalDateTime join_date) {
        this.join_date = join_date;
    }
}
