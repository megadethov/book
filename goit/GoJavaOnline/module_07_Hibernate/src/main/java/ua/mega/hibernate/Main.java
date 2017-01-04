package ua.mega.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import ua.mega.hibernate.controllers.DishController;
import ua.mega.hibernate.controllers.EmployeeController;
import ua.mega.hibernate.controllers.OrderController;

import java.util.ArrayList;
import java.util.List;

public class Main {

    private EmployeeController employeeController;
    private DishController dishController;
    private OrderController orderController;

    public boolean isReInit() {
        return reInit;
    }

    public void setReInit(boolean reInit) {
        this.reInit = reInit;
    }

    private boolean reInit;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml", "hibernate-context.xml");
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    public void init() {
        if (reInit) {
            orderController.removeAllOrders();
            dishController.removeAllDishes();
            employeeController.removeAllEmployee();

            employeeController.initEmployees();
            dishController.initDishes();
            orderController.initOrders();
        }
    }

    private void start() {
        employeeController.printEmployee("John");


//        employeeController.getAllEmployees().forEach(System.out::println);
//        dishController.getAllDishes().forEach(System.out::println);

//        System.out.println(employeeController.getEmployeeByName("John"));
//        System.out.println(dishController.getDishByName("Plov"));
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }

    public void setOrderController(OrderController orderController) {
        this.orderController = orderController;
    }
}

