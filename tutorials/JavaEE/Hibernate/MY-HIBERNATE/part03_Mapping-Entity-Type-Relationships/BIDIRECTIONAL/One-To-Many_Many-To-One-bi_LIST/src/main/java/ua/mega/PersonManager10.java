package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager10 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Person person1 = new Person();
        Person person2 = new Person();
        Address address = new Address();

        person1.setName("Name-1");
        person1.setAddress(address);
        person2.setName("NAME-2");
        person2.setAddress(address);
        address.setCity("CITY");
        address.getPeople().add(person1);
        address.getPeople().add(person2);
        session.save(address);
        session.save(person1);
        session.save(person2);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
