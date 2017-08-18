package ua.mega.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

import javax.xml.bind.annotation.XmlRootElement;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerManagementService customerService;

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ClientErrorInformation> rulesForCustomerNotFound() {
        ClientErrorInformation error = new ClientErrorInformation("The customer wasn't found");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @RequestMapping(value = "/customer/{id}")
    public Customer findCustomerById(@PathVariable String id) throws CustomerNotFoundException {

        Customer foundCustomer = customerService.getFullCustomerDetail(id);
        return customerService.getFullCustomerDetail(id);

    }

}
