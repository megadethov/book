package se.lecture_06_Generics.item_11;

// Наследуясь от типизированного класса в подклассах можно указать конкретный тип
public class InheritanceGeneric {
    public static void main(String[] args) {
        Child child = new Child(100);
        Child2 child2 = new Child2("aaa");
    }
}

class Parent<T> {
    protected T field;

    public Parent(T field) {
        this.field = field;
    }

    public T doSome() {
        return field;
    }
}

class Child extends Parent<Integer> { // здесь тип Integer

    public Child(Integer field) {
        super(field);
    }
}
class Child2 extends Parent<String> { // здесь тип String

    public Child2(String field) {
        super(field);
    }
}