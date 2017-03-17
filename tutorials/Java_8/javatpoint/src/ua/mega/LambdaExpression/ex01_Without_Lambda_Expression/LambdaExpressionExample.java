package ua.mega.LambdaExpression.ex01_Without_Lambda_Expression;

interface Drawable {
    public void draw();
}

public class LambdaExpressionExample {
    public static void main(String[] args) {
        int width = 10;

        //without lambda, Drawable implementation using anonymous class
        Drawable d = new Drawable() {
            @Override
            public void draw() {
                System.out.println("Drawing " + width);
            }
        };
        d.draw();
    }
}
