package ua.mega.java_config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

/**
 * Created by mega on 23.12.2016.
 */

@Configuration // Конфигурация Спринга
public class AppConfig {

    @Bean
    public Bootstrap bootstrap(ExecutorFactory executorFactory, TaskProvider<Integer> integerTaskProvider) { // имя бина будет - bootstrap
        Bootstrap bootstrap = new Bootstrap();
        bootstrap.setExecutorFactory(executorFactory);
        bootstrap.setTaskProvider(integerTaskProvider()); // заинжектили бин
        return bootstrap;
    }

    @Bean
    public TaskProvider<Integer> integerTaskProvider() {
        IntegerTaskProvider integerTaskProvider = new IntegerTaskProvider();
        integerTaskProvider.init(); // выполнили инициализацию
        return integerTaskProvider;
    }

    @Bean
    @Scope("prototype")
    public SerialExecutor<Integer> serialExecutor() {
        return new SerialExecutor<>();
    }

    @Bean
    public ExecutorFactory executorFactory() {
        return new ExecutorFactory() {
            @Override
            public Executor<Integer> getIntegerExecutor() {
                return serialExecutor();
            }
        };
    }


}
