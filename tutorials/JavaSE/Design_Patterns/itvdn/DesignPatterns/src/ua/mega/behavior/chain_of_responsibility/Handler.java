package ua.mega.behavior.chain_of_responsibility;

public abstract class Handler {
    Handler successor;

    public abstract void handlerRequest(int request);
}
