package ua.mega.creational.factory_method._my;

public class Program {
    public static void main(String[] args) {
        AbstractDepartment department = new HrDepartment();
        department.getDeveloper().work();
    }
}
