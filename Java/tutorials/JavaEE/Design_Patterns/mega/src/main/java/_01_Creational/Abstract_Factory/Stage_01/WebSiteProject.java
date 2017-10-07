package _01_Creational.Abstract_Factory.Stage_01;

// А если проектов много и для каждого так создавать команду - НЕ ЭФФЕКТИВНО
public class WebSiteProject {
    public static void main(String[] args) {
        PhpDeveloper phpDeveloper = new PhpDeveloper();
        ManualTester manualTester = new ManualTester();
        ProjectManager projectManager = new ProjectManager();
        phpDeveloper.writeCode();
        manualTester.testCode();
        projectManager.manageProject();
    }
}
