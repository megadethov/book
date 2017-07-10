package ua.mega.avalon.services;

import ua.mega.avalon.domain.Book;

public interface AccountsService {
    public void raiseInvoice(Book requiredBook) throws CustomerCreditExcededException;
}
