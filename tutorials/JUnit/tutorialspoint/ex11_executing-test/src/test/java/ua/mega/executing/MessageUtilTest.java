package ua.mega.executing;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {

    String message = "Hello World";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage() throws Exception {
        assertEquals(message, messageUtil.printMessage());
    }

}