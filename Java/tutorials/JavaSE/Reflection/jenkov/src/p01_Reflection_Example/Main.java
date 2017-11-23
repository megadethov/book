package p01_Reflection_Example;

import java.lang.reflect.Method;

// Here is a quick Java Reflection example to show you what using reflection looks like:
public class Main {
    public static void main(String[] args) {
        Method[] methods = Object.class.getMethods();
        for (Method next : methods) {
            System.out.println(next);
        }
    }
}
