package com.libing.dao;

import com.libing.entity.Customer;
import org.junit.Assert;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Date;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerDaoTest {

    @Autowired
    private CustomerDao customerDao;

    //@Test
    public void insert() throws Exception {
        Customer customer = new Customer();
        customer.setName("initTest");
        customer.setCreateId(1L);
        customer.setCreateName("initTest");
        Assert.assertEquals(1L, customerDao.insert(customer));
    }

    //@Test
    public void update() throws Exception {
        Customer customer = new Customer();
        customer.setId(1000L);
        customer.setContact1("19387134650");
        customer.setBirthday(new Date());
        customer.setEmail("test@163.com");
        Assert.assertEquals(1L, customerDao.update(customer));
    }

    //@Test
    public void delete() throws Exception {
        Assert.assertEquals(1L, customerDao.delete(1000));
    }

    //@Test
    public void selectById() throws Exception {
        Customer customer = new Customer();
        customer.setName("test");
        customer.setSex(1);
        customer.setContact1("19387134650");
        Assert.assertEquals(customer, customerDao.selectById(1000));
    }

    //@Test
    public void selectAll() throws Exception {
        Assert.assertEquals(1, customerDao.selectAll().size());
    }

    //@Test
    public void findByParams() throws Exception {
    }

}