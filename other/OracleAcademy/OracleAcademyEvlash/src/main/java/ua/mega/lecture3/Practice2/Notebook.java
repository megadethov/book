package ua.mega.lecture3.Practice2;

/**
 * Created by Yefremov Yuriy
 */
public class Notebook {
    String title;
    String price;

    public Notebook(String title, String price) {
        this.title = title;
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "title='" + title + '\'' +
                ", price='" + price + '\'' +
                '}';
    }
}
