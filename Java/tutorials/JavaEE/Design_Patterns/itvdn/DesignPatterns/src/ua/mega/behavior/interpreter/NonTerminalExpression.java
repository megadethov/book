package ua.mega.behavior.interpreter;

public class NonTerminalExpression implements AbstractExpression {

    AbstractExpression terminalExpression;
    AbstractExpression nonTerminalExpression;

    @Override
    public void interpret(Context context) {
        if (context.position < context.source.length()) {
            terminalExpression = new TerminalExpression();
            terminalExpression.interpret(context);
            context.position++;
            if(context.result) {
                nonTerminalExpression = new NonTerminalExpression();
                nonTerminalExpression.interpret(context);
            }
        }
    }
}
