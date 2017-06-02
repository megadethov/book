package ua.mega;

import org.hibernate.Session;

import java.util.Date;
import java.util.Map;

public class Program {
    public static void main(String[] args) {
        System.out.println("Hello World");
        Session session = HibernateUtilities.getSessionFactory().openSession();

        session.beginTransaction();
        User user = new User();
        user.setName("Joe");
        user.getHistories().add(new UserHistory(new Date(), "Set the name to Joe"));
        user.getProteinData().setGoal(250);
        user.getHistories().add(new UserHistory(new Date(), "Set the goal to 250"));
        session.save(user);
        session.getTransaction().commit();

        session.beginTransaction();
//        User loadedUser = (User) session.load(User.class, 1); // the same
        User loadedUser = (User) session.get(User.class, 1);
        System.out.println(loadedUser.getName());
        System.out.println(loadedUser.getProteinData().getGoal());

        for (UserHistory history : loadedUser.getHistories()) {
            System.out.println(history.getEntry() + " - " + history.getEntryTime());
        }

        //auto update
        loadedUser.getProteinData().setTotal(50);
        user.getHistories().add(new UserHistory(new Date(), "Set total to 50"));
        session.getTransaction().commit();

        session.close();
        HibernateUtilities.getSessionFactory().close();

    }
}
