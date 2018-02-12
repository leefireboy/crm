package com.libing.web;

import com.libing.entity.Customer;
import com.libing.enums.ResultInfoEnum;
import com.libing.enums.StateEnum;
import com.libing.service.CustomerService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

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
//    @PostMapping(value = "/customer", produces = {"application/json;charset=UTF-8"})
    @RequestMapping(value = "/customer", method = RequestMethod.POST, produces = "application/json;charset=UTF-8")
    public ModelAndView insert(Customer customer) {
        logger.debug("新增客户资料： " + customer.toString());
        ModelAndView mv = new ModelAndView("insert");
        StateEnum result = customerService.insert(customer);
        mv.addObject("result", result.getState());
        return mv;
    }

    /**
     * 更新客户
     * @param customer
     * @return
     */
//    @PutMapping(value = "/customer/{id}", produces = {"application/json;charset=UTF-8"})
    @RequestMapping(value = "/customer/{id}", method = RequestMethod.PUT, produces = {"application/json;charset=UTF-8"})
    public ModelAndView update(@PathVariable("id") Long id, Customer customer) {
        logger.debug("修改客户ID:" + id + "资料： " + customer.toString());
        ModelAndView mv = new ModelAndView("update");
        if (!customer.getId().equals(id)) {
            mv.addObject("result", ResultInfoEnum.DISAGREE.getInfo());
        } else {
            mv.addObject("result", customerService.update(customer).getStateInfo());
        }
        return mv;
    }

    /**
     * 删除客户
     * @param id
     * @return
     */
    @DeleteMapping(value = "/customer/{id}", produces = {"application/json;charset=UTF-8"})
    public Boolean delete(@PathVariable("id") Long id) {
        logger.debug("删除客户： id = " + id);
        customerService.delete(id);
        return null;
    }

    /**
     * 查询客户
     * @param id
     * @param name
     * @param contact
     * @return
     */
    @GetMapping(value = "/customer/list", produces = {"application/json;charset=UTF-8"})
    public List<Customer> selectByParams(Long id, String name, String contact) {
        logger.debug("查询客户列表： ID = " + id + ", NAME = " + name + ", CONTACT = " + contact);
        return customerService.queryCustomerByParams(id, name, contact);
    }

}
