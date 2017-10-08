package _01_Creational.sulem.Abstract_Factory.Stage_02.site;

import _01_Creational.sulem.Abstract_Factory.Stage_02.Developer;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectManager;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectTeamFactory;
import _01_Creational.sulem.Abstract_Factory.Stage_02.Tester;

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
