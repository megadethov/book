package ua.mega;

import org.hibernate.Session;
import sun.dc.path.PathError;
import ua.mega.domain.Address;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager11 {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();

        Address address = new Address();
        Person person = new Person();

        address.setCity("CITY-1");
//        address.setPerson(person);
        person.setName("name-1");
        person.setAddress(address);
        session.save(address);
        session.save(person);
        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
