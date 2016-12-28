package ua.mega.jdbc2.controllers;

import org.springframework.transaction.PlatformTransactionManager;
import org.springframework.transaction.TransactionDefinition;
import org.springframework.transaction.TransactionStatus;
import org.springframework.transaction.support.DefaultTransactionDefinition;
import ua.mega.jdbc2.model.Employee;
import ua.mega.jdbc2.model.EmployeeDao2;

import java.util.List;

public class EmployeeController {

    private PlatformTransactionManager txManager;
    private EmployeeDao2 employeeDao2;

    public List<Employee> getAllEmployees() {
        TransactionStatus status = txManager.getTransaction(new DefaultTransactionDefinition(TransactionDefinition.PROPAGATION_REQUIRED));
        try {
            List<Employee> result = employeeDao2.getAll();
            txManager.commit(status);
            return result;
        } catch (Exception e) {
            txManager.rollback(status);
            throw new RuntimeException(e);
        }
    }

    public void setTxManager(PlatformTransactionManager txManager) {
        this.txManager = txManager;
    }

    public void setEmployeeDao2(EmployeeDao2 employeeDao2) {
        this.employeeDao2 = employeeDao2;
    }
}
