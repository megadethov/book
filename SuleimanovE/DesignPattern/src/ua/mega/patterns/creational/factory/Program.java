package ua.mega.patterns.creational.factory;

public class Program {
    public static void main(String[] args) {
        Developer developer = new CppDeveloper();
        developer.writeCode();
    }
}
