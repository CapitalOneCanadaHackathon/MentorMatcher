package ca.giftthecode.indspire.mentormatcher.repository;

import ca.giftthecode.indspire.mentormatcher.model.Customer;
import org.springframework.data.repository.CrudRepository;

import java.util.List;

/**
 * Created by nathanwu on 11/4/17.
 */
public interface CustomerRepository extends CrudRepository<Customer, Long> {
    List<Customer> findByLastName(String lastName);
}