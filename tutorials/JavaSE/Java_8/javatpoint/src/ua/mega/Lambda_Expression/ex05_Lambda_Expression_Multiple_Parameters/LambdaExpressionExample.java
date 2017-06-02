package ua.mega.Lambda_Expression.ex05_Lambda_Expression_Multiple_Parameters;

interface Addable{
    int add(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
//        Addable ad = (a, b) -> {return a+b;};
        Addable ad = (a, b) -> (a + b);
        System.out.println(ad.add(10, 20));

        // Multiple parameters with data type in lambda expression
        Addable ad2 = (int a, int b) -> (a + b);
        System.out.println(ad2.add(100, 200));
    }
}
