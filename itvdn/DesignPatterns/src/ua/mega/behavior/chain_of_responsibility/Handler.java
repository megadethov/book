package ua.mega.behavior.chain_of_responsibility;

public abstract class Handler {
    Handler handler;

    public abstract void handlerRequest(int request);
}
