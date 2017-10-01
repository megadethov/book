package ua.mega.motd;

public class MessageOfTheDayConfigurableIml implements MessageOfTheDayService {

    private String message;
    private String[] days;

    public void setMessage(String message) {
        this.message = message;
    }

    public void setDays(String[] days) {
        this.days = days;
    }

    @Override
    public String getTodayMessage() {
        return this.message + days[(int)(Math.random()*10)];
    }
}
