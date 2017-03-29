package ua.mega;

import org.hibernate.*;
import org.hibernate.cfg.Configuration;
import sun.reflect.generics.tree.Tree;

import java.util.Iterator;
import java.util.List;
import java.util.SortedSet;
import java.util.TreeSet;


public class ManageEmployee {

    private static SessionFactory factory;

    public static void main(String[] args) {
        try {
            factory = new Configuration().configure().buildSessionFactory();
        } catch (Throwable ex) {
            System.err.println("Failed to create sessionFactory object. " + ex);
            throw new ExceptionInInitializerError(ex);
        }
        ManageEmployee me = new ManageEmployee();
        /* Let us have a set of certificates for the first employee  */
        TreeSet set1 = new TreeSet();
        set1.add(new Certificate("MCA"));
        set1.add(new Certificate("MBA"));
        set1.add(new Certificate("PMP"));

        /* Add employee records in the database */
        Integer empId1 = me.addEmployee("Manoj", "Kumar", 4000, set1);

        /* Another set of certificates for the second employee  */
        TreeSet set2 = new TreeSet();
        set2.add(new Certificate("BCA"));
        set2.add(new Certificate("BA"));

        /* Add another employee record in the database */
        Integer empId2 = me.addEmployee("Dilip", "Kumar", 3000, set2);

        /* List down all the employees */
        me.listEmployees();

        /* Update employee's salary records */
        me.updateEmployee(empId1, 5000);

        /* Delete an employee from the database */
        me.deleteEmployee(empId2);

        /* List down all the employees */
        me.listEmployees();
    }


    /* Method to add an employee record in the database */
    private Integer addEmployee(String firstName, String lastName, int salary, TreeSet certificates) {
        Session session = factory.openSession();
        Transaction tx = null;
        Integer employeeId = null;
        try {
            tx = session.beginTransaction();
            Employee employee = new Employee(firstName, lastName, salary);
            employee.setCertificates(certificates);
            employeeId = (Integer) session.save(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
        return employeeId;
    }

    /* Method to list all the employees detail */
    private void listEmployees() {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            List employees = session.createQuery("FROM Employee").list();
            for (Iterator iterator1 = employees.iterator(); iterator1.hasNext(); ) {
                Employee employee = (Employee) iterator1.next();
                System.out.print("First Name: " + employee.getFirstName());
                System.out.print("  Last Name: " + employee.getLastName());
                System.out.println("  Salary: " + employee.getSalary());
                SortedSet certificates = employee.getCertificates();
                for (Iterator iterator2 = certificates.iterator(); iterator2.hasNext(); ) {
                    Certificate certificate = (Certificate) iterator2.next();
                    System.out.println("Certificate: " + certificate.getName());
                }
            } // outer for
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to update salary for an employee */
    private void updateEmployee(Integer employeeId, Integer salary) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, employeeId);
            employee.setSalary(salary);
            session.update(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }

    /* Method to delete an employee from the records */
    private void deleteEmployee(Integer employeeId) {
        Session session = factory.openSession();
        Transaction tx = null;
        try {
            tx = session.beginTransaction();
            Employee employee = (Employee) session.get(Employee.class, employeeId);
            session.delete(employee);
            tx.commit();
        } catch (HibernateException e) {
            if (tx != null) tx.rollback();
            e.printStackTrace();
        } finally {
            session.close();
        }
    }
}