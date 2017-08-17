package ua.mega.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerManagementService customerService;

    @RequestMapping(value = "/customer/{id}")
    public Customer findCustomerById(@PathVariable String id) throws CustomerNotFoundException {

        Customer foundCustomer = customerService.getFullCustomerDetail(id);
        return customerService.getFullCustomerDetail(id);

    }

}
