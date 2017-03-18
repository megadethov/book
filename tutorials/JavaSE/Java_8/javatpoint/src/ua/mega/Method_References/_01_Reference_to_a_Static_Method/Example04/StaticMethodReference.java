package ua.mega.Method_References._01_Reference_to_a_Static_Method.Example04;

import java.util.function.BiFunction;

/*
You can also override static methods by referring methods. In the following
example, we have defined and overloaded three add methods.
 */
public class StaticMethodReference {
    public static void main(String[] args) {

        BiFunction<Integer, Integer, Integer> adder1 = Arithmetic::add;
        BiFunction<Integer, Float, Float> adder2 = Arithmetic::add;
        BiFunction<Float, Float, Float> adder3 = Arithmetic::add;

        int result1 = adder1.apply(10, 20);
        float result2 = adder2.apply(10, 20.0F);
        float result3 = adder3.apply(10.0F, 20.0F);

        System.out.println(result1);
        System.out.println(result2);
        System.out.println(result3);
    }
}

class Arithmetic {
    public static int add(int a, int b) {
        return a + b;
    }

    public static float add(int a, float b) {
        return a + b;
    }

    public static float add(float a, float b) {
        return a + b;
    }
}
