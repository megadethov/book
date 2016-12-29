package ua.mega.hibernate.aop.annotation_config;

import org.springframework.beans.factory.ObjectFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.stereotype.Component;

@Component // является бином
public class BootstrapA {

    private TaskProvider<Integer> taskProvider;
    private ObjectFactory<Executor<Integer>> executorFactory; // замена типа на ObjectFactory(бин Спринга - создается автоматически)

    public static void main(String[] args) {

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("application-contextAnnotation.xml"); // создаем appContext

        // берем у контекста, созданный Контейнером инстанс ВМЕСТО New (несколько способов)
//        Bootstrap bootstrap = (Bootstrap) applicationContext.getBean("bootstrap"); // требует row кастинга
//        Bootstrap bootstrap = (Bootstrap) applicationContext.getBean(Bootstrap.class); // не требует кастить, но трабла, если сущ. несколько инстансов
        BootstrapA bootstrapA = applicationContext.getBean("bootstrapA", BootstrapA.class); // не требует кастинга

        bootstrapA.execute(); // запускает наше приложение
        bootstrapA.execute(); // java.lang.IllegalStateException: Executor already checkExecuted
    }

    public void execute() {
        Executor<Integer> executor = executorFactory.getObject();
        taskProvider.getAllTasks().forEach(executor::addTask);
        executor.execute();

        System.out.println("Valid results:");
        executor.getInvalidResults().forEach(System.out::println);
        System.out.println("Invalid results:");
        executor.getValidResults().forEach(System.out::println);
    }

@Autowired // инжектить - это поле должно быть автоматически насечено нашему бину
    public void setTaskProvider(TaskProvider<Integer> taskProvider) {
        this.taskProvider = taskProvider;
    }
@Autowired
    public void setExecutorFactory(ObjectFactory<Executor<Integer>> executorFactory) {
        this.executorFactory = executorFactory;
    }
}
