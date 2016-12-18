package ua.mega.structural.proxy;

public class Proxy implements Subject {
    RealSubject realSubject;

    @Override
    public void request() {
        if (realSubject == null) {
            realSubject = new RealSubject();
        }
        realSubject.request();
    }
}
