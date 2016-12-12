package ua.mega;

import org.testng.annotations.Test;

public class BadPractice {

    @Test
    public void testPairTriple() {
        Triple<String, Pair<String, String>, Triple<String, Long, Long>> result = new Triple<String, Pair<String, String>, Triple<String, Long, Long>>();
        result.first = "This is a bad idea";
        result.second = new Pair<>();
        result.second.first = "Nightmare";
        result.second.second = "Looks awful";
        result.third = new Triple<>();
        result.third.first = "Ohh man!";
        result.third.second = 10L;
        result.third.third = 100L;

        // a lot of code here
    }


// обертки, могут применяться, когда вам нужно вернуть из метода несколько значений
    // названия типа first, second - антипаттерн
    public static class Pair<F, S> {
        public F first;
        public S second;
    }
    public static class Triple<F, S, T> {
        public F first;
        public S second;
        public T third;
    }
}
