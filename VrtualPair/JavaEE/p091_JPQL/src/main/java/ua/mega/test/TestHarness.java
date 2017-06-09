package ua.mega.test;

import ua.mega.staffmanagement.domain.Employee;
import ua.mega.staffmanagement.domain.Note;

import javax.persistence.*;
import java.util.List;
import java.util.Set;

public class TestHarness {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

//        dataPopulate(em);

        Query q = em.createQuery("select employee from Employee employee");
        List<Employee> employees = q.getResultList();
        for (Employee next : employees) {
            System.out.println(next);
        }

        tx.commit();
        em.close();
    }

    private static void dataPopulate(EntityManager em) {
        Employee employee = new Employee("first-1", "surname-1", "role-1", 1000);
        Employee employee2 = new Employee("first-2", "surname-2", "role-2", 2000);
        Employee employee3 = new Employee("first-3", "surname-3", "role-3", 3000);
        Employee employee4 = new Employee("first-4", "surname-4", "role-4", 4000);
        Employee employee5 = new Employee("first-5", "surname-5", "role-5", 5000);
        Employee employee6 = new Employee("first-6", "surname-6", "role-6", 6000);
        Employee employee7 = new Employee("first-7", "surname-7", "role-7", 7000);
        Employee employee8 = new Employee("first-8", "surname-8", "role-8", 8000);
        Employee employee9 = new Employee("first-9", "surname-9", "role-9", 9000);
        Employee employee10 = new Employee("first-10", "surname-10", "role-10", 10000);
        em.persist(employee);
        em.persist(employee2);
        em.persist(employee3);
        em.persist(employee4);
        em.persist(employee5);
        em.persist(employee6);
        em.persist(employee7);
        em.persist(employee8);
        em.persist(employee9);
        em.persist(employee10);
    }
}
