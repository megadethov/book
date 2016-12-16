package ua.mega.creational.factory_method;

abstract class Creator {

    Product product;

    public abstract Product factoryMethod();

    // NOP - чисто для оригинальности паттерна GoF
    public void anOperation() {
        product = factoryMethod();
    }

}
