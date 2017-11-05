package ca.giftthecode.indspire.mentormatcher.CustomerManagement;

import ca.giftthecode.indspire.mentormatcher.model.Customer;
import ca.giftthecode.indspire.mentormatcher.repository.CustomerRepository;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.io.IOException;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerRegistration {

    @Autowired
    CustomerRepository repository;

    ObjectMapper objectMapper = new ObjectMapper();

    @RequestMapping(value = "/registernewcustomer", method = RequestMethod.POST)
    public String registerNewCustomer(@RequestBody String inputString) {

        try {
            Customer customer = objectMapper.readValue(inputString, Customer.class);
            System.out.println(customer);
            repository.save(customer);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return inputString;
    }

}
