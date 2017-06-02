package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Email;
import ua.mega.domain.User;
import ua.mega.util.HibernateUtil;

import java.util.Date;

public class UserManager {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();
        user.setName("Name-1");
        user.setAge(44);
        user.getPhones().add("11-222-333");
        user.getPhones().add("22-333-444");
        user.getEmails().add(new Email("mega@mail.com", new Date()));
        user.getEmails().add(new Email("mail@cs.com", new Date()));
        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User loadedUser = (User) session.get(User.class, 1);
        System.out.println(loadedUser.getName());
        for (Email email : loadedUser.getEmails()) {
            System.out.println(email.getName() + " - " + email.getRegistrationDate());
        }
        for (String phone : loadedUser.getPhones()) {
            System.out.println(phone);
        }

        HibernateUtil.getSessionFactory().close();
    }
}
