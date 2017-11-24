package p02_Classes.Superclass;

public class Main {
    public static void main(String[] args) {
//        From the Class object you can access the superclass of the class. Here is how:
        Class<Main> aClass = Main.class;
        Class<? super Main> superclass = aClass.getSuperclass();
        String name = superclass.getName(); // java.lang.Object
    }
}
