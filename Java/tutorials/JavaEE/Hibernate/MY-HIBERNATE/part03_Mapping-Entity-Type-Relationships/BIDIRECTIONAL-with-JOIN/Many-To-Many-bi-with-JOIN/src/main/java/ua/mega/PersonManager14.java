package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager14 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Person person1 = new Person();
        Person person2 = new Person();
        Address address1 = new Address();
        Address address2 = new Address();

        address1.setCity("CITY-1");
        address2.setCity("CITY-2");
        person1.setName("NAME-1");
        person1.getAddresses().add(address1);
        person1.getAddresses().add(address2);
        person2.setName("NAME-2");
        person2.getAddresses().add(address1);
        person2.getAddresses().add(address2);

        session.save(person1);
        session.save(person2);
        session.save(address1);
        session.save(address2);

        session.getTransaction().commit();


        HibernateUtil.getSessionFactory().close();
    }
}
