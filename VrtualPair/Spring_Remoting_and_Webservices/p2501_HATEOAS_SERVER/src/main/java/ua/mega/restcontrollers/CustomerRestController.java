package ua.mega.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

import javax.xml.bind.annotation.XmlRootElement;
import java.net.URI;
import java.net.URISyntaxException;
import java.util.List;

@RestController
public class CustomerRestController {

    @Autowired
    private CustomerManagementService customerService;

    @ExceptionHandler(CustomerNotFoundException.class)
    public ResponseEntity<ClientErrorInformation> rulesForCustomerNotFound() {
        ClientErrorInformation error = new ClientErrorInformation("The customer wasn't found");
        return new ResponseEntity<>(error, HttpStatus.NOT_FOUND);
    }

    @ExceptionHandler(javax.persistence.OptimisticLockException.class)
    @ResponseStatus(value = HttpStatus.CONFLICT)
    public void handleConflicts() {
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.GET)
    public Customer findCustomerById(@PathVariable String id) throws CustomerNotFoundException {

        Customer foundCustomer = customerService.getFullCustomerDetail(id);
        return foundCustomer;

    }

    /**
     * Requirement: ONLY return customers.
     *
     * @return
     */
    @RequestMapping(value = "/customers", method = RequestMethod.GET)
    public CustomerCollectionRepresentation returnAllCustomers(@RequestParam(required = false) Integer first, @RequestParam(required = false) Integer last) {
        List<Customer> allCustomers = customerService.getAllCustomers();
        for (Customer next : allCustomers) {
            next.setCalls(null);
        }
        if (first != null && last != null) {
            return new CustomerCollectionRepresentation(allCustomers.subList(first - 1, last));
        } else {
            return new CustomerCollectionRepresentation(allCustomers);
        }
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer newCustomer) {
        Customer createdCustomer = customerService.newCustomer(newCustomer);
        HttpHeaders headers = new HttpHeaders();
        try {
            headers.setLocation(new URI("http://localhost:8080/mywebapp/customer" + createdCustomer.getCustomerId()));
        } catch (URISyntaxException e) {
            throw new RuntimeException();
        }
        return new ResponseEntity<Customer>(createdCustomer, headers, HttpStatus.CREATED);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.DELETE)
    public void deleteById(@PathVariable String id) throws CustomerNotFoundException {
        Customer oldCustomer = customerService.findCustomerById(id);
        customerService.deleteCustomer(oldCustomer);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT)
    public void updateCustomer(@RequestBody Customer customerToUpdate) throws CustomerNotFoundException {
        customerService.updateCustomer(customerToUpdate);
    }

    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PATCH)
    public void partiallyUpdateCustomer(@RequestBody Customer customerToUpdate,
                                        @PathVariable String id) throws CustomerNotFoundException {
        Customer existingCustomer = customerService.findCustomerById(id);

        // check every field, if it's null, go with the value the customer had before....
        if (customerToUpdate.getCustomerId() == null) {
            customerToUpdate.setCustomerId(id);
        }

        if (customerToUpdate.getNotes() == null) {
            customerToUpdate.setNotes(existingCustomer.getNotes());
        }

        customerService.updateCustomer(customerToUpdate);
    }
}
