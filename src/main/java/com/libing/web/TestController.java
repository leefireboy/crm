package com.libing.web;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.ModelAndView;

/**
 * @Description:
 * @Author: LEE
 * @Date: Create in 2017/10/10 12:17
 */
@RestController
public class TestController {

    @RequestMapping(value = "/index", method = RequestMethod.GET)
    public ModelAndView hello() {
        ModelAndView mv = new ModelAndView("index");
        mv.addObject("name", 123456);
        return mv;
    }

}
