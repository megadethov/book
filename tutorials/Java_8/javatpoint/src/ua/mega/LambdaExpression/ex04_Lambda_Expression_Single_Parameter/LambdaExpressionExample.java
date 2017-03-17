package ua.mega.LambdaExpression.ex04_Lambda_Expression_Single_Parameter;

interface Sayable{
    public String say(String name);
}

public class LambdaExpressionExample {
    public static void main(String[] args) {

        // Lambda expression with single parameter
        Sayable s = (name) -> {
            return "Hello, " + name;
        };

        System.out.println(s.say("Sonoo"));

        // You can omit function parentheses
        Sayable s2 = name -> {
            return "Hello, " + name;
        };

        System.out.println(s2.say("Sonoo"));
    }
}
