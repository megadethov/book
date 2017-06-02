package ua.mega.testsuite;

import org.junit.Test;

import static org.junit.Assert.*;

public class User01Test {
    @Test
    public void print() throws Exception {
        assertEquals("01", new User01().print());
    }
}