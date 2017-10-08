package _01_Creational.sulem.Builder.Stage_02;

public class App {
    public static void main(String[] args) {
        Director director = new Director();
//        director.setBuilder(new WebSiteBuilderVisitCardSiteImpl()); // строитель сайтов - Visit Card
        director.setBuilder(new WebSiteBuilderEnterpriseSiteImpl()); // строитель сайтов - Enterprise

        Website website = director.buildWebsite();

        System.out.println(website);
    }
}
