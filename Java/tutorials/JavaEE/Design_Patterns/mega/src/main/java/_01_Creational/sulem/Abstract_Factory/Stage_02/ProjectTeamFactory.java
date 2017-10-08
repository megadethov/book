package _01_Creational.sulem.Abstract_Factory.Stage_02;

public interface ProjectTeamFactory {
    Developer getDeveloper();

    Tester getTester();

    ProjectManager getProjectManager();
}
