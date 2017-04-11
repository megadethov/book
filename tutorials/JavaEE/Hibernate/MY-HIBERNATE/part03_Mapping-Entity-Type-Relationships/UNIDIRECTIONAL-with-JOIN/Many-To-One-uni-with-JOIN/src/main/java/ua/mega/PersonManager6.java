package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager6 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address = new Address();
        address.setCity("CITY-1");
        Person person1 = new Person();
        person1.setName("NAME-1");
        person1.setAddress(address);
        Person person2 = new Person();
        person2.setName("NAME-2");
        person2.setAddress(address);
        session.save(address);
        session.save(person1);
        session.save(person2);

        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
