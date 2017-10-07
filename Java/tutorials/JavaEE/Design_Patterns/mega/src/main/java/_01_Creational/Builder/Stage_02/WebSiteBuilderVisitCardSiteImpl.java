package _01_Creational.Builder.Stage_02;

public class WebSiteBuilderVisitCardSiteImpl extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Visit Card Site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.WORDPRESS);
    }

    @Override
    void buildPrice() {
        website.setPrice(1000);
    }
}
