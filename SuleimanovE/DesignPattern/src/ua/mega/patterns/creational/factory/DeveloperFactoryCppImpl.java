package ua.mega.patterns.creational.factory;

public class DeveloperFactoryCppImpl implements DeveloperFactory {
    @Override
    public Developer createDeveloper() {
        return new CppDeveloper();
    }
}
