package ua.mega.hibernate.model.dao;

import ua.mega.hibernate.model.Orders;

import java.util.List;

public interface OrderDao {

    void save(Orders order);

    List<Orders> findAllOrders();

    void removeAll();
}
