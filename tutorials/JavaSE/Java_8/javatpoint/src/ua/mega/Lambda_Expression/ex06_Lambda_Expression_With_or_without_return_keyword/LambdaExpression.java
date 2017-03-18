package ua.mega.Lambda_Expression.ex06_Lambda_Expression_With_or_without_return_keyword;

interface Addable {
    int add(int a, int b);
}

public class LambdaExpression {
    public static void main(String[] args) {

        // Lambda expression without return keyword
        Addable ad = (a, b) -> (a + b);
        System.out.println(ad.add(10, 20));

        // Lambda expression with return keyword
        Addable ad2 = (int a, int b) -> {
            return (a + b);
        };
        System.out.println(ad2.add(100, 200));
    }
}
