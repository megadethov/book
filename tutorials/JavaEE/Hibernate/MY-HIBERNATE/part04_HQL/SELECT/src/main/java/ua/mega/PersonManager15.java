package ua.mega;

import org.hibernate.Query;
import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

import java.util.List;

public class PersonManager15 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address = new Address("CITY-1");
        Address address2 = new Address("CITY-2");
        Address address3 = new Address("CITY-3");
        Person person = new Person();
        Person person2 = new Person();
        person.setName("NAME-1");
        person.getAddresses().add(address);
        person.getAddresses().add(address2);
        person.getAddresses().add(address3);

        session.save(person);
        session.save(address);
        session.save(address2);
        session.save(address3);

        session.getTransaction().commit();

        session.beginTransaction();

        Query query = session.createQuery("from Person");
        List<Person> people = query.list();
        for (Person p : people) {
            System.out.println(p.getName());
            System.out.println(p.getAddresses());
        }

        session.getTransaction().commit();
        session.close();

        HibernateUtil.getSessionFactory().close();
    }
}
