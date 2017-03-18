package ua.mega.Method_References._01_Reference_to_a_Static_Method.Example03;

/*
You can also use predefined functional interface to refer methods. In the following example,
we are using BiFunction interface and using it's apply() method
 */

import java.util.function.BiFunction;

public class StaticMethodReference {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder = Arithmetic::add;

        int result = adder.apply(10, 20);
        System.out.println(result);
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }
}
