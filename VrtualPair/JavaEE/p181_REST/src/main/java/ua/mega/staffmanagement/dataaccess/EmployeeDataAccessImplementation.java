package ua.mega.staffmanagement.dataaccess;

import ua.mega.staffmanagement.domain.Employee;

import javax.ejb.Stateless;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;

@Stateless
public class EmployeeDataAccessImplementation {

    @PersistenceContext
    EntityManager em;

    public void insert(Employee newEmployee) {
        em.persist(newEmployee);
    }

    public List<Employee> findAllEmployee() {
        return em.createQuery("select employee from Employee employee").getResultList();
    }

    public List<Employee> findBySurname(String surname) {
       return em.createQuery("select employee from Employee employee where employee.surname=:surname")
                .setParameter("surname", surname)
                .getResultList();
    }

    public Employee findById(int id) throws EmployeeNotFoundException {
       Employee employee = em.find(Employee.class, id);
        if (employee == null) {
            throw new EmployeeNotFoundException();
        }
        return employee;
    }


}
