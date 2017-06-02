package ua.mega.Method_References._02_Reference_to_an_instance_method_of_a_particular_object.Example03;

import java.util.function.BiFunction;

/*
In the following example, we are using BiFunction interface.
It is a predefined interface and contains a functional method apply().
Here, we are referring add method to apply method
 */
public class InstanceMethodReference {
    public static void main(String[] args) {
        BiFunction<Integer, Integer, Integer> adder = new Arithmetic()::add;
        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

class Arithmetic {
    public int add(int a, int b) {
        return a + b;
    }
}
