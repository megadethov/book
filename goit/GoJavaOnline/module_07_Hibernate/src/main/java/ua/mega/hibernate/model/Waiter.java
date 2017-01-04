package ua.mega.hibernate.model;

import javax.persistence.Entity;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import java.util.List;

@Entity
public class Waiter extends Employee {

    @OneToMany
    @JoinColumn(name = "employee_id")
    private List<Orders> orders;
}
