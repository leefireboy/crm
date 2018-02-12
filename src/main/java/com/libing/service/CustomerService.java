package com.libing.service;

import com.libing.entity.Customer;
import com.libing.enums.StateEnum;

import java.util.List;

/**
 * @Description: 客户信息 CRUD Service
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:44
 */
public interface CustomerService {

    StateEnum insert(Customer customer);

    StateEnum update(Customer customer);

    StateEnum delete(Long id);

    Customer selectById(Long id);

    List<Customer> queryCustomerByParams(Long id, String name, String contact);

}
