package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Person;
import ua.mega.util.HibernateUtil;

public class PersonManager {
    public static void main(String[] args) {
        PersonManager personManager = new PersonManager();

        personManager.storeNewPerson("Name-01", 11);
        personManager.storeNewPerson("Name-02", 12);
        personManager.storeNewPerson("Name-03", 13);


        HibernateUtil.getSessionFactory().close();
    }

    private void storeNewPerson(String name, int age) {
        Session session = HibernateUtil.getSessionFactory().getCurrentSession();

        session.beginTransaction();

        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        session.save(person);

        session.getTransaction().commit();
    }
}
