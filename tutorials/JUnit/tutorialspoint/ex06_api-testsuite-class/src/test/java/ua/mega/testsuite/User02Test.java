package ua.mega.testsuite;

import org.junit.Test;

import static org.junit.Assert.*;

public class User02Test {
    @Test
    public void print() throws Exception {
        assertEquals("02", new User02().print());
    }

}