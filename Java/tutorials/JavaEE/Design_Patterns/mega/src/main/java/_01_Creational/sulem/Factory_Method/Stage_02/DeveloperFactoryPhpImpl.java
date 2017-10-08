package _01_Creational.sulem.Factory_Method.Stage_02;

public class DeveloperFactoryPhpImpl implements DeveloperFactory {

    private Developer developer = new DeveloperPhpImpl();

    @Override
    public Developer getDeveloper() {
        return this.developer;
    }
}
