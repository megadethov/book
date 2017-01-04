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

    public List<Orders> getOrders() {
        return orders;
    }

    public void setOrders(List<Orders> orders) {
        this.orders = orders;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("Waiter{");
        sb.append("   id = ").append(getId()).append("\n");
        sb.append("   name = ").append(getName()).append("\n");
        sb.append("   surname = ").append(getSurname()).append("\n");
        sb.append("orders=").append(orders);
        sb.append('}');
        return sb.toString();
    }
}
