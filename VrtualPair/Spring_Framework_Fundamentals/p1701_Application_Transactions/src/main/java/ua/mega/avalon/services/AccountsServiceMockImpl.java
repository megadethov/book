package ua.mega.avalon.services;

import ua.mega.avalon.domain.Book;

public class AccountsServiceMockImpl implements AccountsService {

    @Override
    public void raiseInvoice(Book requiredBook) {
        // a very basic implementation for testing
        System.out.println("Raised the invoice for " + requiredBook);
    }
}
