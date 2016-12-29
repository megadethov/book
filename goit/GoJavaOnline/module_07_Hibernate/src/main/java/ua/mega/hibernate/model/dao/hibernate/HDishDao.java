package ua.mega.hibernate.model.dao.hibernate;

import org.hibernate.SessionFactory;
import ua.mega.hibernate.model.Dish;
import ua.mega.hibernate.model.dao.DishDao;

public class HDishDao implements DishDao {

     private SessionFactory sessionFactory;

    @Override
    public void save(Dish dish) {
        sessionFactory.getCurrentSession().save(dish);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
