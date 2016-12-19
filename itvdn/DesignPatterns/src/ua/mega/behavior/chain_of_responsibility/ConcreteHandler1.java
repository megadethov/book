package ua.mega.behavior.chain_of_responsibility;

public class ConcreteHandler1 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request == 1) {
            System.out.println("One");
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
