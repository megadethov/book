package ua.mega.Lambda_Expression.ex03_Lambda_Expression_No_Parameter;

interface Sayable{
    public String say();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        Sayable s = () -> {
            return "I have nothing to say";
        };
        System.out.println(s.say());
    }
}
