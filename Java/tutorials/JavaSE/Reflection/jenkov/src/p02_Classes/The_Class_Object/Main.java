package p02_Classes.The_Class_Object;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        If you know the name of the class at compile time you can obtain a Class object like this:
        Class<Cat> catClass = Cat.class;
//        If you don't know the name at compile time, but have the class name as a string at runtime, you can do like this:
//        String className = ... //obtain class name as string at runtime
        Class<?> aClass = Class.forName("p02_Classes.The_Class_Object.Cat");
    }
}

class Cat {

}