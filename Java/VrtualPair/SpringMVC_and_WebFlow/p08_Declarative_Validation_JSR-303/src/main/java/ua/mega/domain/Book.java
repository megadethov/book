package ua.mega.domain;

import org.hibernate.validator.constraints.NotEmpty;

import javax.validation.constraints.Digits;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;

public class Book implements java.io.Serializable {
    private static final long serialVersionUID = 1L;
    private static int nextId = 1;
    private int id;
    @NotEmpty
    @Pattern(regexp="[0-9]*[xX0-9]")
    private String isbn;
    @NotEmpty
    private String title;
    @NotEmpty
    private String author;
    @Min(value = 0)
    @Digits(integer=3, fraction=2)
    private double price;

    public Book(String isbn, String title, String author, double price) {
        this.id = nextId++;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    public Book() {
        // TODO Auto-generated constructor stub
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String toString() {
        return this.title + " by " + this.author;
    }

    public String getIsbn() {
        return this.isbn;
    }

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public double getPrice() {
        return price;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
