package ua.mega.restcontrollers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Link;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import ua.mega.domain.Customer;
import ua.mega.services.customers.CustomerManagementService;
import ua.mega.services.customers.CustomerNotFoundException;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.linkTo;
import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

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
    public CustomerCollectionRepresentation returnAllCustomers(@RequestParam(required = false) Integer first, @RequestParam(required = false) Integer last) throws CustomerNotFoundException {
        List<Customer> allCustomers = customerService.getAllCustomers();
        for (Customer next : allCustomers) {
            next.setCalls(null);

//            URI uri = linkTo(methodOn(CustomerRestController.class).findCustomerById(next.getCustomerId())).toUri();
            Link link = linkTo(methodOn(CustomerRestController.class).findCustomerById(next.getCustomerId())).withSelfRel();
            next.add(link);

        }
        if (first != null && last != null) {
            return new CustomerCollectionRepresentation(allCustomers.subList(first - 1, last));
        } else {
            return new CustomerCollectionRepresentation(allCustomers);
        }
    }

    @RequestMapping(value = "/customers", method = RequestMethod.POST)
//    @ResponseStatus(value = HttpStatus.CREATED)
    public ResponseEntity<Customer> createNewCustomer(@RequestBody Customer newCustomer) throws CustomerNotFoundException {
        Customer createdCustomer = customerService.newCustomer(newCustomer);
        HttpHeaders headers = new HttpHeaders();

//        URI uri = ServletUriComponentsBuilder.fromCurrentContextPath().path("/customer/").path(createdCustomer.getCustomerId()).build().toUri();

//        URI uri = MvcUriComponentsBuilder.fromMethodName(CustomerRestController.class, "findCustomerById", createdCustomer.getCustomerId()).build().toUri();

//        URI uri = linkTo(methodOn(CustomerRestController.class).findCustomerById("102")).toUri();

        URI uri = linkTo(methodOn(CustomerRestController.class).findCustomerById("102")).toUri();

        headers.setLocation(uri);

        return new ResponseEntity<>(createdCustomer, headers, HttpStatus.CREATED);
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
