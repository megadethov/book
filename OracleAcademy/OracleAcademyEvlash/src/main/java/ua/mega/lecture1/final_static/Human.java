package ua.mega.lecture1.final_static;

/**
 * Created by Yefremov Yuriy
 */
public class Human {
    private int age;
    private String  name;
    //    final String field; // финальные поля обязательно нужно инициализировать, причем ОДИН РАЗ
    // варианты регшения:
    // - сразу при создании
    // - в блоке инициализации
    // - в каждом конструкторе

    final static String staticField = "staticFieldFromMetaSpace"; // живет в обекте типа Class в MetaSpace


    public Human(int age, String name) {
        this.age = age;
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return "Human{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
}
