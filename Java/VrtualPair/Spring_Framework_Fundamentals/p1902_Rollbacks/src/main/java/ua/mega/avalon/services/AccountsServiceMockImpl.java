package ua.mega.avalon.services;

import ua.mega.avalon.domain.Book;

public class AccountsServiceMockImpl implements AccountsService {

    @Override
    public void raiseInvoice(Book requiredBook) throws CustomerCreditExcededException {
//        throw new CustomerCreditExcededException();
        System.out.println("Reised invoice");
    }
}
