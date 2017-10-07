package _01_Creational.Abstract_Factory.Stage_02.site;

import _01_Creational.Abstract_Factory.Stage_02.Developer;
import _01_Creational.Abstract_Factory.Stage_02.ProjectManager;
import _01_Creational.Abstract_Factory.Stage_02.ProjectTeamFactory;
import _01_Creational.Abstract_Factory.Stage_02.Tester;
import _01_Creational.Abstract_Factory.Stage_02.bank_system.DeveloperJavaImpl;
import _01_Creational.Abstract_Factory.Stage_02.bank_system.ProjectManagerBankingImpl;
import _01_Creational.Abstract_Factory.Stage_02.bank_system.TesterQaImpl;

public class ProjectTeamFactorySiteImpl implements ProjectTeamFactory {

    @Override
    public Developer getDeveloper() {
        return new DeveloperPhpImpl();
    }

    @Override
    public Tester getTester() {
        return new TesterManualImpl();
    }

    @Override
    public ProjectManager getProjectManager() {
        return new ProjectManagerSiteImpl();
    }
}
