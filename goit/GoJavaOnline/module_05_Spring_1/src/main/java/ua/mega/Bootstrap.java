package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {
    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml"); // создаем appContext
        Bootstrap bootstrap = applicationContext.getBean("bootstrap", Bootstrap.class); // берем у контекста, созданный Контейнером инстанс

        bootstrap.execute();
    }

    public void execute() {
        SerialExecutor<Integer> executor = new SerialExecutor<>();
        executor.addTask(new AddTask(1, -2));
        executor.addTask(new AddTask(1, 2), result -> result >= 0);
        executor.addTask(new AddTask(1, -2), result -> result >= 0);
        executor.addTask(new AddTask(Integer.MAX_VALUE, 1), result -> result >= 0);
        executor.execute();

        System.out.println("Valid results:");
        executor.getInvalidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        executor.getValidResults().forEach(System.out::println);
    }

}
