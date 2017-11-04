package ca.giftthecode.indspire.mentormatcher.CustomerMatching;

import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by nathanwu on 11/4/17.
 */

@RestController
public class CustomerMatching {

    @RequestMapping(value = "/getcustomermatches", method = RequestMethod.GET)
    public String registerNewCustomer() {
        return "no matches";
    }

}
