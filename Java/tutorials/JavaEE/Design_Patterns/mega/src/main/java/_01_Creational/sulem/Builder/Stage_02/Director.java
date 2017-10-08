package _01_Creational.sulem.Builder.Stage_02;

// Именно этот класс будет определять конкретную реализацию для создания Website и строить его с помощью WebSiteBuilder
// Типа Прораб, к-ый будет просто дергать методы Строителя.
public class Director {
    private WebSiteBuilder builder;

    public void setBuilder(WebSiteBuilder builder) { // от типа Builder и будет зависеть конкретная реализация Website
        this.builder = builder;
    }

    public Website buildWebsite() {
        builder.createWebSite();
        builder.buildName();
        builder.buildCms();
        builder.buildPrice();

       return builder.getWebsite();
    }
}
