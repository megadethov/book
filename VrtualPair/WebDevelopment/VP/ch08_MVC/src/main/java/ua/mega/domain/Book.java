package ua.mega.domain;

public class Book {
    private static int nextId = 1;
    private int id;
    private String isbn;
    private String title;
    private String author;
    private double price;

    public Book() {
    }

    public Book(String isbn, String title, String author, double price) {
        this.id = nextId++;
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.price = price;
    }

    @Override
    public String toString() {
        return this.title + " by " + this.author;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
