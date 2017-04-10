package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager3 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        Person person = new Person();
        person.setName("NAME-1");
        session.save(person);
        Address address = new Address();
        address.setCity("CITY-1");
        address.setPerson(person);
        session.save(address);
        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
