package ua.mega.testsuite;

import org.junit.Test;

import static org.junit.Assert.*;

public class User03Test {
    @Test
    public void print() throws Exception {
        assertEquals("03", new User03().print());
    }

}