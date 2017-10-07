package _01_Creational.Builder.Stage_02;

public abstract class WebSiteBuilder {
    Website website;

    protected void createWebSite() {
        website = new Website();
    }

    abstract void buildName();

    abstract void buildCms();

    abstract void buildPrice();

    public Website getWebsite() {
        return this.website;
    }
}
