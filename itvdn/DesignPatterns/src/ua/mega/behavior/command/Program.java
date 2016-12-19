package ua.mega.behavior.command;

public class Program {
    public static void main(String[] args) {
        Receiver receiver = new Receiver();
        Command command = new ConcreteCommand(receiver);
        Invoker invoker = new Invoker();

        invoker.storeCommand(command);
        invoker.executeCommand();
    }
}
