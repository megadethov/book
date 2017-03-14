package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Foo foo = ctx.getBean(Foo.class);
        ctx.registerShutdownHook();
    }
}
