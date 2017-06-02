package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager8 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address1 = new Address();
        address1.setCity("CITY-1");
        Address address2 = new Address();
        address2.setCity("CITY-2");
        Person person = new Person();
        person.setName("NAME-1");
        person.getAddresses().add(address1);
        person.getAddresses().add(address2);
        Person person2 = new Person();
        person2.setName("NAME-2");
        person2.getAddresses().add(address1);
        person2.getAddresses().add(address2);
        session.save(address1);
        session.save(address2);
        session.save(person);
        session.save(person2);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
