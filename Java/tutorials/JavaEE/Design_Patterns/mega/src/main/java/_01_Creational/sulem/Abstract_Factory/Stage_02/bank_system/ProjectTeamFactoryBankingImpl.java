package _01_Creational.sulem.Abstract_Factory.Stage_02.bank_system;

import _01_Creational.sulem.Abstract_Factory.Stage_02.Developer;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectManager;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectTeamFactory;
import _01_Creational.sulem.Abstract_Factory.Stage_02.Tester;

public class ProjectTeamFactoryBankingImpl implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new DeveloperJavaImpl();
    }

    @Override
    public Tester getTester() {
        return new TesterQaImpl();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerBankingImpl();
    }
}
