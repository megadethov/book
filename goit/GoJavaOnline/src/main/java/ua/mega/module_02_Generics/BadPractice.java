package ua.mega.module_02_Generics;

public class BadPractice {


// обертки, могут применяться, когда вам нужно вернуть из метода несколько значений
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
