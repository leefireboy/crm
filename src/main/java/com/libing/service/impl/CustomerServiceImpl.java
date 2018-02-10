package com.libing.service.impl;

import com.libing.dao.CustomerDao;
import com.libing.entity.Customer;
import com.libing.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Description: 客户信息 CRUD Service
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:45
 */
@Service
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerDao customerDao;

    @Override
    public int addCustomer(Customer customer) {
        return customerDao.insert(customer);
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
