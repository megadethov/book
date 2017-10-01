package ua.mega.Functional_Interfaces.Predefined_Functional_Interfaces.Java_Consumer_Interface.Example01;

import java.util.function.Consumer;

public class ConsumerInterfaceExample {

    public static void main(String[] args) {

        // Referring method to String type Consumer interface
        Consumer<String> consumer1 = ConsumerInterfaceExample::printMessage;
        Consumer<Integer> consumer2 = ConsumerInterfaceExample::printValue;

        // Calling Consumer method
        consumer1.accept("John");
        consumer2.accept(12);
    }


    static void printMessage(String name){
        System.out.println("Hello "+name);
    }
    static void printValue(int val){
        System.out.println(val);
    }
}
