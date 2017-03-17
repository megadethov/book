package ua.mega.LambdaExpression.ex05_Lambda_Expression_Multiple_Parameters;

interface Addable{
    int add(int a, int b);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        // Multiple parameters in lambda expression
//        Addable ad = (a, b) -> {return a+b;};
        Addable ad = (a, b) -> (a + b);
        System.out.println(ad.add(10, 20));
    }
}
