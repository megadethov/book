package ua.mega.hibernate.model.controllers;

import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.Dish;
import ua.mega.hibernate.model.Order;
import ua.mega.hibernate.model.dao.DishDao;
import ua.mega.hibernate.model.dao.EmployeeDao;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class OrderController {

    private EmployeeDao employeeDao;
    private DishDao dishDao;

    @Transactional
    public void createOrder(String waiterName, List<String> dishes, int tableNumber) {
        Order order = new Order();
        order.setWaiter(employeeDao.findByName(waiterName));
        order.setDishes(createDishes(dishes));
        order.setTableNumber(tableNumber);
        order.setOrderDate(new Date());

    }

    private List<Dish> createDishes(List<String> dishes) {
        List<Dish> result = new ArrayList<>();
        for (String dishName : dishes) {
            result.add(dishDao.findByName(dishName));
        }
        return result;
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
}
