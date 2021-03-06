package se.lecture_01_AdvancedClasses.item1_1;

/**
 * Created by Yefremov Yuriy
 */
//В этом примере показано, что абстрактный класс заставляет всех своих наследников реализовать все свои абстрактные методы
//или тоже объявить себя абстрактными
abstract class Parent {
    int p1;
    public Parent() {
        System.out.println("Construct Main");
        p1 = 1;
    }
    void Print() {System.out.println(p1);}
    abstract void test(); // у абстрактного метода нет тела
}

class Child extends Parent {
    public Child() {System.out.println("Construct Child");}

    @Override
    void test() {}

//    abstract void method(); // нельзя сделать абстрактный метод в не абстрактном классе
}

public class Main {
    public static void main(String[] args) {
        Parent parent; // такая переменная может ссылаться как на Main так и на всех его детей
//        parent = new Main(); // ошибка компиляции при попытке создать инстанс абстрактного класса
        Parent child = new Child(); // сначала будет построен Main, а затем Child.
        child.Print(); // Child доступен метод Main

    }
}
