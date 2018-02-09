package com.libing.base;

import java.io.Serializable;
import java.util.List;

/**
 * @Description: 基础 DAO
 * @Auther: LEE
 * @Date: Create in 2018/2/9 13:52
 */
public interface BaseDao<T> {

    /**
     * 新增
     * @param t
     * @return
     */
    int add(T t);

    /**
     * 修改
     * @param t
     * @return
     */
    int update(T t);

    /**
     * 删除
     * @param t
     * @return
     */
    int delete(T t);

    /**
     * 根据 ID 查找
     * @param id
     * @return
     */
    T findById(Serializable id);

    /**
     * 查询全部
     * @return
     */
    List<T> findAll();

}
