package ua.mega.ignore;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

//Ignore at class level
//@Ignore
public class MessageUtilTest {

    String message = "Robert";
    MessageUtil messageUtil = new MessageUtil(message);

    @Ignore
    @Test
    public void printMessage() throws Exception {
        System.out.println("Inside testPrintMessage()");
        message = "Robert";
        assertEquals(message, messageUtil.printMessage());
    }

    @Test
    public void salutationMessage() throws Exception {
        System.out.println("Inside testSalutationMessage()");
        message = "Hi!" + "Robert";
        assertEquals(message, messageUtil.salutationMessage());
    }

}