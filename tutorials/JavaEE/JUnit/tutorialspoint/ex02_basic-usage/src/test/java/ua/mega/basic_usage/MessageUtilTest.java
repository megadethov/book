package ua.mega.basic_usage;

import org.junit.Test;

import static org.junit.Assert.*;

public class MessageUtilTest {

    String message = "Hello World";

    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void printMessage() throws Exception {

//        message = "New World"; // it's failed the test
        assertEquals(message, messageUtil.printMessage());
    }

}