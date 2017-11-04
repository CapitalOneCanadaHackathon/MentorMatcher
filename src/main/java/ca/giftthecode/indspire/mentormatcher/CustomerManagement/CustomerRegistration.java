package ca.giftthecode.indspire.mentormatcher.CustomerManagement;

import ca.giftthecode.indspire.mentormatcher.model.Customer;
import ca.giftthecode.indspire.mentormatcher.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerRegistration {

    @Autowired
    CustomerRepository repository;

    @RequestMapping(value = "/registernewcustomer", method = RequestMethod.POST)
    public String registerNewCustomer(@RequestBody String inputString) {
        repository.save(new Customer("Jack", "Smith"));
        repository.save(new Customer("Adam", "Johnson"));
        repository.save(new Customer("Kim", "Smith"));
        repository.save(new Customer("David", "Williams"));
        repository.save(new Customer("Peter", "Davis"));
        return inputString;
    }

    @RequestMapping(value = "/findcustomer", method = RequestMethod.POST)
    public String findCustomer(@RequestBody String inputString) {
        List<Customer> customerList = repository.findByLastName("Smith");
        Customer c = customerList.get(0);
        System.out.println(c);
        System.out.println(c);
        return customerList.get(0).toString();
    }

}
