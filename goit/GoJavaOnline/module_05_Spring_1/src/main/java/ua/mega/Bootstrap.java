package ua.mega;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap implements ApplicationContextAware {

    private ApplicationContext applicationContext;
    private TaskProvider<Integer> taskProvider;

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-context.xml"); // создаем appContext

        // берем у контекста, созданный Контейнером инстанс ВМЕСТО New (несколько способов)
//        Bootstrap bootstrap = (Bootstrap) applicationContext.getBean("bootstrap"); // требует row кастинга
//        Bootstrap bootstrap = (Bootstrap) applicationContext.getBean(Bootstrap.class); // не требует кастить, но трабла, если сущ. несколько инстансов
        Bootstrap bootstrap = applicationContext.getBean("bootstrap", Bootstrap.class); // не требует кастинга

        bootstrap.execute(); // запускает наше приложение
        bootstrap.execute(); // java.lang.IllegalStateException: Executor already checkExecuted
    }

    public void execute() {
        Executor<Integer> executor = getExecutor();
        taskProvider.getAllTasks().forEach(executor::addTask);
        executor.execute();

        System.out.println("Valid results:");
        executor.getInvalidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        executor.getValidResults().forEach(System.out::println);
    }

    private Executor<Integer> getExecutor() {
        return (Executor<Integer>) applicationContext.getBean("serialExecutor", SerialExecutor.class);
    }

    public void setTaskProvider(TaskProvider<Integer> taskProvider) {
        this.taskProvider = taskProvider;
    }

    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.applicationContext = applicationContext;
    }
}
