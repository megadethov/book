package ua.mega.ex02_Lambda_Expressions_Example;

public class Java8Tester {
    public static void main(String[] args) {
        Java8Tester tester = new Java8Tester();

        //with type declaration
        MathOperation addition = (int a, int b) -> a + b;
        System.out.println("10 + 5 = " + tester.operate(10, 5, addition));
        // TODO: 16.03.2017  
    }

    interface MathOperation {
        int operation(int a, int b);
    }

    interface GreetingService {
        void sayMessage(String message);
    }

    private int operate(int a, int b, MathOperation mathOperation) {
        return mathOperation.operation(a, b);
    }
}
