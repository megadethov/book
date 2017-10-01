package ua.mega.test;

import javax.ejb.Local;
import javax.ejb.Remote;
import javax.ejb.Remove;
import java.util.List;

@Remote
public interface ShoppingCardSession {
    void addItem(String item);

    List<String> getAllItems();

    @Remove
    void checkout();
}
