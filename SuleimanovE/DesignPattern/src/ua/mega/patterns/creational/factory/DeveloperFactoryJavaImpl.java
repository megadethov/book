package ua.mega.patterns.creational.factory;

public class DeveloperFactoryJavaImpl implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new JavaDeveloper();
    }
}
