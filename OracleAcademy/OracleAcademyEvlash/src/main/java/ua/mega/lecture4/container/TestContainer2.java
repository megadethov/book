package ua.mega.lecture4.container;

import ua.mega.lecture1.final_static.Human;

/**
 * Created by Yefremov Yuriy
 */
public class TestContainer2 {
    public static void main(String[] args) {
        Container<KeyEnum, Human> container = new Container<>(); // для ключей вместо String можем взять Enum
        container.add(KeyEnum.TWO, new Human(25, "Johan")); // ключ-"one" значение-Human
        container.add(KeyEnum.FOUR, new Human(20, "Ben"));
        container.add(KeyEnum.ONE, new Human(50, "Robert"));
        container.add(KeyEnum.ONE, new Human(48, "Tom"));

        System.out.println(container.getValue(KeyEnum.ONE)); // 2 ключа - 2 значения
     }
}
