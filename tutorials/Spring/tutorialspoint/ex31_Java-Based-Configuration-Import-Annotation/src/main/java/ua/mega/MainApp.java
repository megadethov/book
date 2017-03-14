package ua.mega;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class MainApp {
    public static void main(String[] args) {
        ApplicationContext ctx = new AnnotationConfigApplicationContext(ConfigA.class);

        A a = ctx.getBean(A.class);
        B b = ctx.getBean(B.class);

        a.print();
        b.print();
    }
}
