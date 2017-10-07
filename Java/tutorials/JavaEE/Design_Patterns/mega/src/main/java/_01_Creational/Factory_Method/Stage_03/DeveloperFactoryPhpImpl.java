package _01_Creational.Factory_Method.Stage_03;

public class DeveloperFactoryPhpImpl implements DeveloperFactory {

    private Developer developer = new DeveloperPhpImpl();

    @Override
    public Developer getDeveloper() {
        return this.developer;
    }
}
