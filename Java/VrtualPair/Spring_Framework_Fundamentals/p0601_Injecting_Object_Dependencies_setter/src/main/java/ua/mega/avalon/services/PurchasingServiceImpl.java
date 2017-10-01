package ua.mega.avalon.services;

import ua.mega.avalon.domain.Book;

public class PurchasingServiceImpl implements PurchasingService {
    private AccountsService accounts;
    private BookService books;

    public PurchasingServiceImpl() {
        System.out.println("Cteate instance of PurchasingServiceImpl..." + this);
    }

    public void setAccounts(AccountsService accounts) {
        this.accounts = accounts;
    }

    public void setBooks(BookService books) {
        this.books = books;
    }

    @Override
    public void buyBook(String isbn) {
        // find the correct book
        Book requiredBook = books.getBookByIsbn(isbn);

        // now raise the invoice
        accounts.raiseInvoice(requiredBook);
    }
}
