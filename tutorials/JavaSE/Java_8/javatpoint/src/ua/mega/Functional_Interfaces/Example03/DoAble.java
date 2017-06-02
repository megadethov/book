package ua.mega.Functional_Interfaces.Example03;

/*
A functional interface can extends to other interface only when that
does not have any abstract method.
 */

//@FunctionalInterface   // Invalid '@FunctionalInterface' annotation; doable is not a functional interface
public interface DoAble extends Sayable {
    void doIt();
}

interface Sayable{
    void say(String msg);   // abstract method
}
