package p02_Classes.Methods;

import java.lang.reflect.Method;

public class Main {
    public static void main(String[] args) {
        Class<Main> aClass = Main.class;
        Method[] methods = aClass.getMethods();
    }

    public String toPrint() {
        return "PRINT";
    }
}
