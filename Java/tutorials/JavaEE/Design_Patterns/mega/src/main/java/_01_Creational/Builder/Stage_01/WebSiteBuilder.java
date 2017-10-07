package _01_Creational.Builder.Stage_01;

public class WebSiteBuilder {
    public static void main(String[] args) {

        Website website = new Website();

        website.setName("Visit Card");
        website.setCms("Wordpress");
        website.setPrice(500);

        System.out.println(website);
    }
}
