package com.libing;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @Description:
 * @Auther: LEE
 * @Date: Create in 2018/2/4 11:23
 */
@SpringBootApplication
@MapperScan("com.libing.dao")
public class ApplicationStarter {

    public static void main(String[] args) {
        SpringApplication.run(ApplicationStarter.class, args);
    }

}
