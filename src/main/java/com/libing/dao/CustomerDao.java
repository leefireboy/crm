package com.libing.dao;

import com.libing.base.BaseDao;
import com.libing.entity.Customer;

import java.util.List;

/**
 * @Description: 客户信息 DAO
 * @Auther: LEE
 * @Date: Create in 2018/2/6 23:05
 */
public interface CustomerDao extends BaseDao<Customer> {

    /**
     * TODO 根据参数查询客户
     * @param id
     * @param name
     * @param contact
     * @return
     */
    List<Customer> findByParams(Long id, String name, String contact);

}
