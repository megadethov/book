package ua.mega.hibernate;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.controllers.DishController;
import ua.mega.hibernate.model.controllers.EmployeeController;

public class Main {

    private EmployeeController employeeController;
    private DishController dishController;

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml", "hibernate-context.xml");
        Main main = applicationContext.getBean(Main.class);
        main.start();
    }

    private void start() {
        employeeController.createEmployee();
        dishController.createDish();

        employeeController.getAllEmployees().forEach(System.out::println);
        dishController.getAllDishes().forEach(System.out::println);

//        System.out.println(employeeController.getEmployeeByName("John"));
    }

    public void setEmployeeController(EmployeeController employeeController) {
        this.employeeController = employeeController;
    }

    public void setDishController(DishController dishController) {
        this.dishController = dishController;
    }
}
