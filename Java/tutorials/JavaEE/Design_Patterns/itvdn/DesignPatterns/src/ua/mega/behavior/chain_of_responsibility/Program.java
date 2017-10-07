package ua.mega.behavior.chain_of_responsibility;

public class Program {
    public static void main(String[] args) {
        Handler h1 = new ConcreteHandler1();
        Handler h2 = new ConcreteHandler2();

        h1.successor = h2;

        h1.handlerRequest(1);
        h1.handlerRequest(2);
    }
}
