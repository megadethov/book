package ua.mega.hibernate.aop.xml_config;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Bootstrap {

    private TaskProvider<Integer> taskProvider;
    private ExecutorFactory executorFactory;

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
        Executor<Integer> executor = executorFactory.getIntegerExecutor();
        taskProvider.getAllTasks().forEach(executor::addTask);
        executor.execute();

        System.out.println("Valid results:");
        executor.getInvalidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        executor.getValidResults().forEach(System.out::println);
    }


    public void setTaskProvider(TaskProvider<Integer> taskProvider) {
        this.taskProvider = taskProvider;
    }

    public void setExecutorFactory(ExecutorFactory executorFactory) {
        this.executorFactory = executorFactory;
    }
}
