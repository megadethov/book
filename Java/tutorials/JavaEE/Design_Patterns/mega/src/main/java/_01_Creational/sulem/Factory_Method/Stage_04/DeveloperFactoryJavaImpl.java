package _01_Creational.sulem.Factory_Method.Stage_04;

public class DeveloperFactoryJavaImpl implements DeveloperFactory {

    private Developer developer = new DeveloperJavaImpl();

    @Override
    public Developer getDeveloper() {
        return this.developer;
    }
}
