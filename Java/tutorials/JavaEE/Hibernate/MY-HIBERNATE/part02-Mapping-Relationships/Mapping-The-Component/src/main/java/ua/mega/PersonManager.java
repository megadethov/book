package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Passport;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager {
    public static void main(String[] args) {
        Person person = new Person();
        Passport passport = new Passport();

        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        person.setName("Name-1");
        person.setAge(21);
        passport.setPassportSerial("SA");
        passport.setPassportNumber(11111222);
        person.setPassport(passport);
        session.save(person);
        session.getTransaction().commit();

        session.beginTransaction();
        Person loadedPerson = (Person) session.get(Person.class, 1);
        System.out.println(loadedPerson.getName());
        session.getTransaction().commit();

        HibernateUtil.getSessionFactory().close();
    }
}
