package _01_Creational.sulem.Builder.Stage_01;

public class App {
    public static void main(String[] args) {

        Website website = new Website();

        website.setName("Visit Card");
        website.setCms("Wordpress");
        website.setPrice(500);

        System.out.println(website);

        // Предположим, что мы хотим делать несколько сайтов (Студия).
    }
}
