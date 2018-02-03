package com.libing.web;

import com.libing.entity.Customer;
import org.springframework.web.bind.annotation.*;

/**
 *
 */
@RestController(value = "/customer")
public class CustomerController {

    @PostMapping(value = "/")
    public Customer addCustomer(Customer customer) {
        return null;
    }

    @PutMapping(value = "")
    public Customer modifyCustomer(Customer customer) {
        return null;
    }

    @DeleteMapping
    public Boolean deleteCustomer(Long id) {
        return true;
    }

    @GetMapping
    public Customer queryCustomer(Long id) {
        return null;
    }

}
