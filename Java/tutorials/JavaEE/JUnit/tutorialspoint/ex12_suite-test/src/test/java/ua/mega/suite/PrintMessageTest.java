package ua.mega.suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PrintMessageTest {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testPrintMessage() throws Exception {
        System.out.println("Inside testPrintMessage()");
        assertEquals(message, messageUtil.printMessage());
    }
}
