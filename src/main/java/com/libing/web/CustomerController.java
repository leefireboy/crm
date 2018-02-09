package com.libing.web;

import com.libing.entity.Customer;
import com.libing.exception.NoEffectException;
import com.libing.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

/**
 * @Description: 客户 Controller
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:23
 */
@RestController
public class CustomerController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerService customerService;

    /**
     * 客户新增
     * @param customer
     * @return
     */
    @PostMapping(value = "/customer", produces = {"application/json;charset=UTF-8"})
    public Customer addCustomer(Customer customer) {
        logger.debug("新增客户资料： " + customer.toString());
        int i = customerService.addCustomer(customer);
        if (i <= 0) {
            throw new NoEffectException("数据库数据没有修改！");
        } else {
            return new Customer();// TODO: 2018/2/7

        }
    }

    /**
     * 更新客户
     * @param customer
     * @return
     */
    @PutMapping(value = "/customer/{id}", produces = {"application/json;charset=UTF-8"})
    public Customer modifyCustomer(@PathVariable("id") Long id, Customer customer) {
        logger.debug("修改客户ID:" + id + "资料： " + customer.toString());
        return customerService.modifyCustomer(id, customer);
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    @DeleteMapping(value = "/customer/{id}", produces = {"application/json;charset=UTF-8"})
    public Boolean deleteCustomer(@PathVariable("id") Long id) {
        logger.debug("删除客户： id = " + id);
        return customerService.deleteCustomer(id);
    }

    /**
     * 查询客户
     * @param id
     * @param name
     * @param contact
     * @return
     */
    @GetMapping(value = "/customer/list", produces = {"application/json;charset=UTF-8"})
    public List<Customer> queryCustomerByParams(Long id, String name, String contact) {
        logger.debug("查询客户列表： ID = " + id + ", NAME = " + name + ", CONTACT = " + contact);
        return customerService.queryCustomerByParams(id, name, contact);
    }

}
