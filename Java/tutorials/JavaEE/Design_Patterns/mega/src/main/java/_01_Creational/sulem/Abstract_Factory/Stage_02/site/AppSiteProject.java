package _01_Creational.sulem.Abstract_Factory.Stage_02.site;

import _01_Creational.sulem.Abstract_Factory.Stage_02.Developer;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectManager;
import _01_Creational.sulem.Abstract_Factory.Stage_02.ProjectTeamFactory;
import _01_Creational.sulem.Abstract_Factory.Stage_02.Tester;

public class AppSiteProject {
    public static void main(String[] args) {

        // Эта фабрика создает тим для Site проекта
        ProjectTeamFactory ptf = new ProjectTeamFactorySiteImpl();

        Developer developer = ptf.getDeveloper();
        Tester tester = ptf.getTester();
        ProjectManager projectManager = ptf.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.managesProject();
    }
}
