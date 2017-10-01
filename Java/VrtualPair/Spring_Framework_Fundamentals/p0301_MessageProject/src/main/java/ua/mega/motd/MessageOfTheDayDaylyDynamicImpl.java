package ua.mega.motd;

import java.util.Date;

public class MessageOfTheDayDaylyDynamicImpl implements MessageOfTheDayService {

    private String message;

    @Override
    public String getTodayMessage() {
        return this.message + new Date();
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
