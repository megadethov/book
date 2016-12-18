package ua.mega.structural.facade;

public class Facade {
    SubSystemA subSystemA = new SubSystemA();
    SubSystemB subSystemB = new SubSystemB();
    SubSystemC subSystemC = new SubSystemC();

    public void operationAB() {
        subSystemA.operationA();
        subSystemB.operationB();
    }

    public void operationBC() {
        subSystemB.operationB();
        subSystemC.operationC();
    }
}
