package ua.mega.Functional_Interfaces.Predefined_Functional_Interfaces.Java_BiConsumer_Interface.Example01;

import java.util.function.BiConsumer;

public class BiConsumerInterfaceExample {

    public static void main(String[] args) {
        // Referring method
        BiConsumer<String, Integer> biCon = BiConsumerInterfaceExample::ShowDetails;
        biCon.accept("Rama", 20);
        biCon.accept("Shyam", 20);

        // Using lambda expression
        BiConsumer<String, Integer> biCon2 = (name, age) -> BiConsumerInterfaceExample.ShowDetails(name, age);
        biCon2.accept("Peter", 28);
    }

    static void ShowDetails(String name, Integer age) {
        System.out.println(name + " " + age);
    }
}
