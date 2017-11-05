package ca.giftthecode.indspire.mentormatcher.CustomerMatching;

import ca.giftthecode.indspire.mentormatcher.model.Customer;
import ca.giftthecode.indspire.mentormatcher.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerMatching {

    @Autowired
    CustomerRepository repository;

    @RequestMapping(value = "/findcustomers", method = RequestMethod.POST)
    public String findCustomer(@RequestBody String inputString) {
        List<Customer> customerList = repository.findByEducationAndProgramTrack("highschool", "mentee");
        System.out.println(Arrays.toString(customerList.toArray()));
        return inputString;
    }

    @RequestMapping(value = "/getcustomermatches", method = RequestMethod.GET)
    public String registerNewCustomer() {
        return "no matches";
    }

}
