package ua.mega.services;

import java.util.List;

import ua.mega.domain.Book;
import ua.mega.domain.Customer;
import ua.mega.domain.Order;

public interface AccountsService 
{
	public void raiseInvoice(Book requiredBook);
	
	public Customer findCustomer(String id) throws CustomerNotFoundException;
}
