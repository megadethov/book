package ua.mega.structural.proxy;

public class Program {
    public static void main(String[] args) {
        Subject proxy = new Proxy();
        proxy.request();
    }
}
