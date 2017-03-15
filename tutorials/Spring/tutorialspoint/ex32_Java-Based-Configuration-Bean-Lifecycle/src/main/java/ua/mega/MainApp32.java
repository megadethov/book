package ua.mega;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

public class MainApp32 {
    public static void main(String[] args) {

        AbstractApplicationContext ctx = new AnnotationConfigApplicationContext(AppConfig.class);

        Foo foo = ctx.getBean(Foo.class);
        ctx.registerShutdownHook();
    }
}
