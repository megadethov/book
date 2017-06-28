package ua.mega.motd;

public class MessageOfTheDayBasicImpl implements MessageOfTheDayService {

    private String message;

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String getTodayMessage() {
        return this.message;
    }
}
