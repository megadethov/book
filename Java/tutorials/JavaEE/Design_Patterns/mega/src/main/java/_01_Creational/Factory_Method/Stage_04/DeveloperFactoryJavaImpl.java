package _01_Creational.Factory_Method.Stage_04;

public class DeveloperFactoryJavaImpl implements DeveloperFactory {

    private Developer developer = new DeveloperJavaImpl();

    @Override
    public Developer getDeveloper() {
        return this.developer;
    }
}
