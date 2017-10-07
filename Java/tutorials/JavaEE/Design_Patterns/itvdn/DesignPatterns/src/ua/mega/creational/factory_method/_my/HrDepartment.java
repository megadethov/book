package ua.mega.creational.factory_method._my;

public class HrDepartment extends AbstractDepartment {

    @Override
    public AbstractDeveloper getDeveloper() {
//        return new JavaDeveloper();
        return new CppDeveloper();
    }
}
