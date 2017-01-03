package ua.mega.hibernate.model.dao;

import ua.mega.hibernate.model.Order;

import java.util.List;

public interface OrderDao {

    void save(Order order);

    List<Order> findAllOrders();
}
