package com.libing.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author: LEE
 * @Date: Create in 2017/10/10 12:17
 */
@RestController
public class TestController {

    @GetMapping(value = "/hello")
    public String hello() {
        return "hello boot";
    }

}
