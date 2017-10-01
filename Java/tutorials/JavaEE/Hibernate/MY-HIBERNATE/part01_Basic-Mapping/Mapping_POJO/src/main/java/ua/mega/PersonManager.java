package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager {
    public static void main(String[] args) {
        Person person = new Person();

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        person.setName("Name-1");
        person.setAge(21);
        session.save(person);
        session.getTransaction().commit();

        session.beginTransaction();
        Person loadedPerson = (Person) session.get(Person.class, 1);
//        Person loadedPerson = (Person) session.get(Person.class, 100); // if not exist - NPE
//        Person loadedPerson = (Person) session.load(Person.class, 100); // if not exist - ONFE
        System.out.println(loadedPerson.getName());

        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
