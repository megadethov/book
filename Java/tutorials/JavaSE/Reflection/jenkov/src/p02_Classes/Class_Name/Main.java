package p02_Classes.Class_Name;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException {
//        If you know the name of the class at compile time you can obtain a Class object like this:
        Class<Cat> catClass = Cat.class;

// From a Class object you can obtain its name in two versions. The fully qualified class name (including package name)
// is obtained using the getName() method like this:
        String name = catClass.getName();

//        If you want the class name without the pacakge name you can obtain it using the getSimpleName() method, like this:
        name = catClass.getSimpleName();
    }
}

class Cat {

}