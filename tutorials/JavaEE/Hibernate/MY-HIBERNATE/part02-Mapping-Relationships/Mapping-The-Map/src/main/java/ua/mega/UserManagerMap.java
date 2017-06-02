package ua.mega;

import org.hibernate.Session;
import ua.mega.domain.Email;
import ua.mega.domain.User;
import ua.mega.util.HibernateUtil;

import java.util.Date;
import java.util.Map;

public class UserManagerMap {
    public static void main(String[] args) {
        Session session = HibernateUtil.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();
        user.setName("Name-1");
        user.setAge(21);
        user.getEmails().put("num-01", new Email("mega@mail.com", new Date()));
        user.getEmails().put("num-02", new Email("deth@mail.com", new Date()));
        user.getEmails().put("num-03", new Email("bet@mail.com", new Date()));
        user.getPhones().put("tel-01", "111-22-333");
        user.getPhones().put("tel-02", "222-33-444");
        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
        User loadedUser = (User) session.get(User.class, 1);
        System.out.println(loadedUser.getName());
        for (Map.Entry<String, Email> entry : loadedUser.getEmails().entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue().getName() + ", " + entry.getValue().getRegistrationDate());
        }
        for (Map.Entry<String, String> entry : loadedUser.getPhones().entrySet()){
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }

        session.close();
        HibernateUtil.getSessionFactory().close();
    }
}
