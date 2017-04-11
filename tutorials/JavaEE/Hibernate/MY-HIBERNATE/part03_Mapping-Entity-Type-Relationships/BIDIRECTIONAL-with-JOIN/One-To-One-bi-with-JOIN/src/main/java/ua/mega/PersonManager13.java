package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager13 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Person person = new Person();
        Address address = new Address();

        address.setCity("CITY-1");
        person.setName("NAME-1");
        person.setAddress(address);
        session.save(address);
        session.save(person);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
