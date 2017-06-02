package ua.mega.Method_References._04_Reference_to_a_constructor.Example;

public class ConstructorReference {
    public static void main(String[] args) {
        Messageable hello = Message::new;
        hello.getMessage("Hello");
    }
}

interface Messageable{
    Message getMessage(String msg);
}

class Message{
    public Message(String msg) {
        System.out.println(msg);
    }
}
