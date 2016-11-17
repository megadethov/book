package ua.mega.lecture3.Practice2;

/**
 * Created by Yefremov Yuriy
 */
public class Notebook {
    String firma;
    String model;
    String description;
    double price;

    public Notebook(String firma, String model, String description, double price) {
        this.firma = firma;
        this.model = model;
        this.description = description;
        this.price = price;
    }

    public String getFirma() {
        return firma;
    }

    public void setFirma(String firma) {
        this.firma = firma;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public String toString() {
        return "Notebook{" +
                "firma='" + firma + '\'' +
                ", model='" + model + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                '}';
    }
}
