package ua.mega.behavior.interpreter;

public class Program {
    public static void main(String[] args) {
        Context context = new Context();
        context.vocabulary = 'a';
        context.source = "aaa";

        AbstractExpression expression = new NonTerminalExpression();
        expression.interpret(context);

        System.out.println(context.result);
    }
}
