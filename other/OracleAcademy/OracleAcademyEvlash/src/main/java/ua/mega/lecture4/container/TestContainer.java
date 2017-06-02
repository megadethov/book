package ua.mega.lecture4.container;

import ua.mega.lecture1.final_static.Human;

/**
 * Created by Yefremov Yuriy
 */
public class TestContainer {
    public static void main(String[] args) {
        Container<String, Human> container = new Container<>(); // для ключей вместо String можем взять Enum
        container.add("one", new Human(25, "Johan")); // ключ-"one" значение-Human
        container.add("three", new Human(20, "Ben"));
        container.add("two", new Human(50, "Robert"));
        container.add("two", new Human(48, "Tom"));

        System.out.println(container.getValue("two")); // 2 ключа - 2 значения
     }
}
