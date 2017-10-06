package _07_Generic_extends_implements;

public class App {
}


/*
class Name<T extends A & B & C & D> {
    A - класс или интерфейс
    B, C, D - только интерфейсы
}*/

// Например
// ТОЛЬКО те Product, к-ые имплементят Comparable
// Container<T extends Product & Comparable<T>>