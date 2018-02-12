package com.libing.service.impl;

import com.libing.dao.CustomerDao;
import com.libing.entity.Customer;
import com.libing.enums.StateEnum;
import com.libing.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
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

    private final Logger logger = LoggerFactory.getLogger(this.getClass());

    @Autowired
    private CustomerDao customerDao;

    @Override
    public StateEnum insert(Customer customer) {
        try {
            customerDao.insert(customer);
            return StateEnum.SUCCESS;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return StateEnum.FAIL;
        }
    }

    @Override
    public StateEnum update(Customer customer) {
        try {
            customerDao.update(customer);
            return StateEnum.SUCCESS;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return StateEnum.FAIL;
        }
    }

    @Override
    public StateEnum delete(Long id) {
        try {
            customerDao.delete(id);
            return StateEnum.SUCCESS;
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return StateEnum.FAIL;
        }
    }

    @Override
    public Customer selectById(Long id) {
        try {
            return customerDao.selectById(id);
        } catch (Exception e) {
            logger.error(e.getMessage(), e);
            return null;
        }
    }

    @Override
    public List<Customer> queryCustomerByParams(Long id, String name, String contact) {
        return null;
    }

}
