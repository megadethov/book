package ua.mega.avalon.services;

import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import ua.mega.avalon.domain.Book;

@Service("accountsService")
public class AccountsServiceMockImpl implements AccountsService {

    @Override
    public void raiseInvoice(Book requiredBook) throws CustomerCreditExcededException {
//        throw new CustomerCreditExcededException();
        System.out.println("Reised invoice");
    }
}
