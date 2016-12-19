package ua.mega.behavior.interpreter;

public class TerminalExpression implements AbstractExpression {
    @Override
    public void interpret(Context context) {
        context.result = context.source.charAt(context.position) == context.vocabulary;
    }
}
