package ua.mega.test;

import ua.mega.staffmanagement.domain.Employee;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestHarness {

    public static void main(String[] args) {
        EntityManagerFactory emf = Persistence.createEntityManagerFactory("employeeDB");
        EntityManager em = emf.createEntityManager();
        EntityTransaction tx = em.getTransaction();
        tx.begin();

        /*Employee employee = new Employee("Vasya", "Pupkun", "boss", 1000);
        em.persist(employee);*/

        /*Employee findEmployee = em.find(Employee.class, 1);
        findEmployee.setSurname("DirtySurname");*/

        Employee findEmployee = em.find(Employee.class, 1);
        em.remove(findEmployee);

        tx.commit();
        em.close();
    }
}
