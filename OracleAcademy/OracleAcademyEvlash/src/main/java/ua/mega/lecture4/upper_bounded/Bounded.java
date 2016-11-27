package ua.mega.lecture4.upper_bounded;

/**
 * Created by Yefremov Yuriy
 */
public class Bounded<T extends Number> { // параметром Т может быть только Number или его наследники
    T testField;

    public Bounded(T testField) {
        this.testField = testField;
    }
}
