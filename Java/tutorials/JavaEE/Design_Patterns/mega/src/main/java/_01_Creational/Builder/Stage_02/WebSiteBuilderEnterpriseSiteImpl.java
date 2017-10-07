package _01_Creational.Builder.Stage_02;

public class WebSiteBuilderEnterpriseSiteImpl extends WebSiteBuilder {
    @Override
    void buildName() {
        website.setName("Enterprise Site");
    }

    @Override
    void buildCms() {
        website.setCms(Cms.DRUPAL);
    }

    @Override
    void buildPrice() {
        website.setPrice(8000);
    }
}
