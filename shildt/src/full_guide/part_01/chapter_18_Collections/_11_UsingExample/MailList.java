package full_guide.part_01.chapter_18_Collections._11_UsingExample;

import java.util.LinkedList;

/**
 * Created by mega on 08.09.2016.
 */
public class MailList {
    public static void main(String[] args) {
        LinkedList<Address> ll = new LinkedList<>();
        ll.add(new Address("J.W.West", "11 Oak Ave", "Urbana", "IL", "61801"));
        ll.add(new Address("Ralph Baker", "1142 Maple Lane", "Mahomet", "IL", "39487"));
        ll.add(new Address("Tom Carlton", "867 Elm St", "Champaing", "IL", "293845"));

        for (Address a : ll) {
            System.out.println(a);
            System.out.println();
        }
    }
}
