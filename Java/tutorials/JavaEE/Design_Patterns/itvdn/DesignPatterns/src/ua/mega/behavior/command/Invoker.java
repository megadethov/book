package ua.mega.behavior.command;

public class Invoker {
    Command command;

    public void storeCommand(Command command) {
        this.command = command;
    }
    public void executeCommand() {
        command.execute();
    }
}
