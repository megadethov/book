package ua.mega.test;

import javax.ejb.Remove;
import javax.ejb.Stateful;
import java.util.ArrayList;
import java.util.List;

@Stateful
public class ShoppingCardSessionImplementation implements ShoppingCardSession {
    private List<String> items;

    public ShoppingCardSessionImplementation() {
        this.items = new ArrayList<String>();
    }

    @Override
    public void addItem(String item) {
        items.add(item);
    }

    @Override
    public List<String> getAllItems() {
        return this.items;
    }

    @Override
    @Remove
    public void checkout() {
        // add items to DB
    }
}
