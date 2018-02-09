package com.libing.service.impl;

import com.libing.entity.Customer;
import com.libing.service.CustomerService;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 客户信息 CRUD Service
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:45
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Override
    public int addCustomer(Customer customer) {
        return 0;
    }

    @Override
    public Customer modifyCustomer(Long id, Customer customer) {
        return null;
    }

    @Override
    public Boolean deleteCustomer(Long id) {
        return null;
    }

    @Override
    public List<Customer> queryCustomerByParams(Long id, String name, String contact) {
        return null;
    }

}
