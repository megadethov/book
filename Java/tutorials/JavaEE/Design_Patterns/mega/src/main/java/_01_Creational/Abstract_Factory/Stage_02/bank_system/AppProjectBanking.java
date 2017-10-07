package _01_Creational.Abstract_Factory.Stage_02.bank_system;

import _01_Creational.Abstract_Factory.Stage_02.Developer;
import _01_Creational.Abstract_Factory.Stage_02.ProjectManager;
import _01_Creational.Abstract_Factory.Stage_02.ProjectTeamFactory;
import _01_Creational.Abstract_Factory.Stage_02.Tester;
import _01_Creational.Abstract_Factory.Stage_02.bank_system.ProjectTeamFactoryBankingImpl;

public class AppProjectBanking {
    public static void main(String[] args) {

        // Эта фабрика создает тим для Banking проекта
        ProjectTeamFactory ptf = new ProjectTeamFactoryBankingImpl();

        Developer developer = ptf.getDeveloper();
        Tester tester = ptf.getTester();
        ProjectManager projectManager = ptf.getProjectManager();

        developer.writeCode();
        tester.testCode();
        projectManager.managesProject();

    }
}
