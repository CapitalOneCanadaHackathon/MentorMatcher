package ca.giftthecode.indspire.mentormatcher.CustomerManagement;

import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerRegistration {

    @RequestMapping(value = "/registernewcustomer", method = RequestMethod.POST)
    public String registerNewCustomer(@RequestBody String inputString) {
        return inputString;
    }

}
