package ua.mega.hibernate.model.dao.hibernate;

import org.hibernate.SessionFactory;
import ua.mega.hibernate.model.Order;
import ua.mega.hibernate.model.dao.OrderDao;

import java.util.List;

public class HOrderDao implements OrderDao {

    private SessionFactory sessionFactory;

    @Override
    public void save(Order order) {
        sessionFactory.getCurrentSession().save(order);
    }

    @Override
    public List<Order> findAllOrders() {
      return sessionFactory.getCurrentSession().createQuery("select o from Order o").list();
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
