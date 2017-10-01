package ua.mega.client;

import ua.mega.test.ShoppingCardSession;

import javax.naming.Context;
import javax.naming.InitialContext;
import javax.naming.NamingException;
import java.util.List;

public class StatefulClientTest {
    public static void main(String[] args) {
        try {
            Context jndi = new InitialContext();
            ShoppingCardSession card = (ShoppingCardSession) jndi.lookup("java:global/Employee/ShoppingCardSessionImplementation");
            card.addItem("CD Disk");
            card.addItem("NoteBook");
            card.addItem("Books");

            List<String> allItems = card.getAllItems();
            for (String next : allItems) {
                System.out.println(next);
            }

            // don't forget
            card.checkout();

        } catch (NamingException e) {
            e.printStackTrace();
        }
    }
}
