package ua.mega.hibernate.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.Dish;
import ua.mega.hibernate.model.Orders;
import ua.mega.hibernate.dao.DishDao;
import ua.mega.hibernate.dao.EmployeeDao;
import ua.mega.hibernate.dao.OrderDao;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class OrderController {

    private EmployeeDao employeeDao;
    private DishDao dishDao;
    private OrderDao orderDao;

    @Transactional
    public  void initOrders() {

        String waiterName = "John";
        List<String> dishes = new ArrayList<>(Arrays.asList("Plov", "Salad"));
        int tableNumber = 1;

        Orders orders = new Orders();
        orders.setWaiter(employeeDao.findByName(waiterName));
        orders.setDishes(createDishes(dishes));
        orders.setTableNumber(tableNumber);
        orders.setOrderDate(new Date());

        orderDao.save(orders);

        String waiterName2 = "Mary";
        List<String> dishes2 = new ArrayList<>(Arrays.asList("Potato", "Salad"));
        int tableNumber2 = 2;

        Orders orders2 = new Orders();
        orders2.setWaiter(employeeDao.findByName(waiterName2));
        orders2.setDishes(createDishes(dishes2));
        orders2.setTableNumber(tableNumber2);
        orders2.setOrderDate(new Date());

        orderDao.save(orders2);
    }

    @Transactional
    public void createOrder(String waiterName, List<String> dishes, int tableNumber) {
        Orders orders = new Orders();
        orders.setWaiter(employeeDao.findByName(waiterName));
        orders.setDishes(createDishes(dishes));
        orders.setTableNumber(tableNumber);
        orders.setOrderDate(new Date());

        orderDao.save(orders);

    }

    @Transactional
    public List<Orders> getAllOrders() {
        return orderDao.findAllOrders();
    }

    @Transactional
    private List<Dish> createDishes(List<String> dishes) {
        List<Dish> result = new ArrayList<>();
        for (String dishName : dishes) {
            result.add(dishDao.findByName(dishName));
        }
        return result;
    }

    @Transactional
    public void printAllOrders() {
        getAllOrders().forEach(System.out::println);
    }

    @Transactional
    public void removeAllOrders() {
        orderDao.removeAll();
    }

    public EmployeeDao getEmployeeDao() {
        return employeeDao;
    }

    public void setEmployeeDao(EmployeeDao employeeDao) {
        this.employeeDao = employeeDao;
    }

    public DishDao getDishDao() {
        return dishDao;
    }

    public void setDishDao(DishDao dishDao) {
        this.dishDao = dishDao;
    }

    public OrderDao getOrderDao() {
        return orderDao;
    }

    public void setOrderDao(OrderDao orderDao) {
        this.orderDao = orderDao;
    }
}
