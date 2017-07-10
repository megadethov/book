package ua.mega.avalon.services;

import ua.mega.avalon.data.BookNotFoundException;

public interface PurchasingService
{
	public void buyBook(String isbn) throws BookNotFoundException, CustomerCreditExcededException;
}