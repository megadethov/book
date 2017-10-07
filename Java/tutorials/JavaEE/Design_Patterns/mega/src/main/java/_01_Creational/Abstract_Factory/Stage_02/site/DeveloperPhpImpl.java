package _01_Creational.Abstract_Factory.Stage_02.site;

import _01_Creational.Abstract_Factory.Stage_02.Developer;

public class DeveloperPhpImpl implements Developer {
    @Override
    public void writeCode() {
        System.out.println("PHP dev write PHP code...");
    }
}
