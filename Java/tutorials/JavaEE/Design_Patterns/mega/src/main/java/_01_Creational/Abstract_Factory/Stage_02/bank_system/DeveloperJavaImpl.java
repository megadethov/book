package _01_Creational.Abstract_Factory.Stage_02.bank_system;

import _01_Creational.Abstract_Factory.Stage_02.Developer;

public class DeveloperJavaImpl implements Developer {
    @Override
    public void writeCode() {
        System.out.println("Java dev write java code...");
    }
}
