package ua.mega.avalon.services;

import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;

@Transactional
public class PurchasingServiceImpl implements PurchasingService {
    private AccountsService accounts;
    private BookService books;

    public PurchasingServiceImpl(AccountsService accounts, BookService books) {
        this.accounts = accounts;
        this.books = books;
    }

   /* public PurchasingServiceImpl() {
        System.out.println("Cteate instance of PurchasingServiceImpl..." + this);
    }*/

   /* public void setAccounts(AccountsService accounts) {
        this.accounts = accounts;
    }
    public void setBooks(BookService books) {
        this.books = books;
    }*/

    @Transactional(rollbackFor = {CustomerCreditExcededException.class, BookNotFoundException.class})
    @Override
    public void buyBook(String isbn) throws BookNotFoundException, CustomerCreditExcededException {
        // find the correct book
        Book requiredBook = books.getBookByIsbn(isbn);

        // delete the book from stock
        books.deleteFromStock(requiredBook);

        // now raise the invoice
        accounts.raiseInvoice(requiredBook);
    }
}
