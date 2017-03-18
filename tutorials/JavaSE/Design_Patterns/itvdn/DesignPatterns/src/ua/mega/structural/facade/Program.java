package ua.mega.structural.facade;

public class Program {
    public static void main(String[] args) {
        Facade facade = new Facade();
        facade.operationAB();
        facade.operationBC();

//        SubSystemA subSystemA = new SubSystemA();
//        subSystemA.operationA();
    }
}
