package se.lecture_06_Generics.item_10;

import java.util.ArrayList;
import java.util.List;

public class GenericMascSuper {
    public static void main(String[] args) {
        List<Child> children = new ArrayList<>();
        List<Child2> children2 = new ArrayList<>();
        List<Parent> parents = new ArrayList<>();
        List<SuperParent> superParents = new ArrayList<>();
        List<Object> objects = new ArrayList<>();

        print1(parents); // it's work
        print1(superParents); // it's work
        print1(objects); // it's work
//        print1(children); // ошибка компиляции - не является предком Parent
//        print1(children2); // ошибка компиляции - не является предком Parent

        print2(parents); // it's work
        print2(children); // it's work
        print2(children2); // it's work
//        print2(superParents); // ошибка компиляции - не является потомком Parent
//        print2(objects); // ошибка компиляции - не является потомком Parent

    }

    public static void print1(List<? super Parent> list) { // Parent и его предки
        System.out.println("it's work");
    }
    public static void print2(List<? extends Parent> list) { // Parent и его потомки
        System.out.println("it's work too");
    }
}

class SuperParent {
}

class Parent extends SuperParent {
}

class Child extends Parent {
}

class Child2 extends Parent {
}
