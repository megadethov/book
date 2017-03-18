package ua.mega.behavior.chain_of_responsibility;

public class ConcreteHandler2 extends Handler {
    @Override
    public void handlerRequest(int request) {
        if (request == 2) {
            System.out.println("Two");
        } else if (successor != null) {
            successor.handlerRequest(request);
        }
    }
}
