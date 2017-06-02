package ua.mega.time;

public class MessageUtil {
    private String message;

    public MessageUtil(String message) {
        this.message = message;
    }

    // prints the message
    public void printMessage(){
        System.out.println(message);
        while(true);
    }

    // add "Hi!" to the message
    public String salutationMessage(){
        message = "Hi!" + message;
        System.out.println(message);
        return message;
    }
}
