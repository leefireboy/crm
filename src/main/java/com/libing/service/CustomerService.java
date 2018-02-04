package com.libing.service;

import com.libing.entity.Customer;

import java.util.List;

/**
 * @Description: 客户信息 CRUD Service
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:44
 */
public interface CustomerService {

    Customer addCustomer(Customer customer);

    Customer modifyCustomer(Long id, Customer customer);

    Boolean deleteCustomer(Long id);

    List<Customer> queryCustomerByParams(Long id, String name, String contact);

}
