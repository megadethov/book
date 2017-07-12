package ua.mega.avalon.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Isolation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.transaction.interceptor.TransactionAspectSupport;
import ua.mega.avalon.data.BookNotFoundException;
import ua.mega.avalon.domain.Book;

@Transactional
public class PurchasingServiceImpl implements PurchasingService {

    @Autowired
    private AccountsService accounts;
    @Autowired
    private BookService books;

    @Transactional(rollbackFor = {CustomerCreditExcededException.class, BookNotFoundException.class}, timeout = 10, isolation = Isolation.SERIALIZABLE)
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
