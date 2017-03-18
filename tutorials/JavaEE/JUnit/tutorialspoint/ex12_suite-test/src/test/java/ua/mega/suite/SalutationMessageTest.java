package ua.mega.suite;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SalutationMessageTest {
    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Test
    public void testSalutationMessage() throws Exception {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";

        assertEquals(message, messageUtil.salutationMessage());

    }
}
