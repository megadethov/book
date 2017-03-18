package ua.mega.behavior.command;

public abstract class Command {
    private Receiver receiver;

    public Receiver getReceiver() {
        return receiver;
    }

    public Command(Receiver receiver) {
        this.receiver = receiver;
    }

    public abstract void execute();
}
