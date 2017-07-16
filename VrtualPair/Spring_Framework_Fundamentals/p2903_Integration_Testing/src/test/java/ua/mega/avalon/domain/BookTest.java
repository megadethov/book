package ua.mega.avalon.domain;

import org.junit.Test;

import static org.junit.Assert.*;

public class BookTest {
    @Test
    public void testBooksWithTheSameISBNNumberAreConsideredTheSameProduct() throws Exception {
        // arrange
        Book bookOne = new Book("7326837268237", "Java Puzzles", "Josh Bloch", 10.99);
        Book bookTwo = new Book("7326837268237", "Java Puzzles", "Josh Bloch", 10.99);

        // act
        boolean areTheyEqual = bookOne.equals(bookTwo);

        // assert
        assertTrue(areTheyEqual);
    }

    @Test
    public void testFormatOfTheToStringIsCorrect() throws Exception {
        // arrange
        Book bookOne = new Book("7326837268237", "Java Puzzles", "Josh Bloch", 10.99);

        // act
        String toStringResult = bookOne.toString();

        // assert
        assertEquals("Java Puzzles by Josh Bloch", toStringResult);
    }
}