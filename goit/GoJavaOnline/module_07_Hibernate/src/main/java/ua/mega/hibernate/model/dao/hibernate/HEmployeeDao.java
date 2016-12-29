package ua.mega.hibernate.model.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.transaction.annotation.Transactional;
import ua.mega.hibernate.model.Employee;
import ua.mega.hibernate.model.dao.EmployeeDao;


import java.util.List;

public class HEmployeeDao implements EmployeeDao {

    private SessionFactory sessionFactory;

    @Override
    @Transactional
    public void save(Employee employee) {
        sessionFactory.getCurrentSession().save(employee);
    }

    @Override
    public Employee load(Long id) {
        return null;
    }

    @Override
    public List<Employee> findAll() {
        Session session = sessionFactory.getCurrentSession();
       return session.createQuery("select e from Employee e").list(); // select * from employee
    }

    @Override
    public Employee findByName(String name) {
        Session session = sessionFactory.getCurrentSession();
        Query query = session.createQuery("select  e from Employee e where e.name like :name");
        query.setParameter("name", name);
        return (Employee) query.uniqueResult();
    }

    @Override
    public void remove(Employee employee) {
        sessionFactory.getCurrentSession().delete(employee);
    }

    public void setSessionFactory(SessionFactory sessionFactory) {
        this.sessionFactory = sessionFactory;
    }
}
