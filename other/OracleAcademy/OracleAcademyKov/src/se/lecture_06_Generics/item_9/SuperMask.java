package se.lecture_06_Generics.item_9;

import java.util.ArrayList;
import java.util.List;

public class SuperMask {
    public static void main(String[] args) {
        List<Child> listChild = new ArrayList<>();
        List<Parent> listParent = new ArrayList<>();
        List<LittleChild> listLittle = new ArrayList<>();

        test(listChild);
        test(listParent);
//        test(listLittle); // ошибка компиляции - LittleChild не является предком Child

    }
    private static void test(List<? super Child> param) { // тип = Child и его предки
        System.out.println(param);
    }
}

class Parent {
}

class Child extends Parent {
}

class LittleChild extends Child {

}
