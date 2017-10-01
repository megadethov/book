package ua.mega.forms;

import org.apache.struts.action.ActionForm;
import org.apache.struts.validator.ValidatorForm;

//public class BookForm extends ActionForm {
public class BookForm extends ValidatorForm {

    private String isbn;
    private String title;
    private String author;
    private String price;

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

    public String getPrice() {
        return price;
    }

    public void setPrice(String price) {
        this.price = price;
    }
}
