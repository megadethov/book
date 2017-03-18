package ua.mega.lecture4.container;

import ua.mega.lecture1.final_static.Human;

/**
 * Created by Yefremov Yuriy
 */
public class TestContainer3 {
    public static void main(String[] args) {
        // Значение тоже может быть типизированным - Person<Integer, Sex>
        Container<KeyEnum, Person<Integer, Sex>> container = new Container<>();
        container.add(KeyEnum.TWO, new Person<>("Bob", 100, Sex.MALE));
        container.add(KeyEnum.ONE, new Person<>("MILA", 50, Sex.FEMALE));
        container.add(KeyEnum.ONE, new Person<>("MILA", 60, Sex.FEMALE));


        System.out.println(container.getValue(KeyEnum.ONE));
     }
}
