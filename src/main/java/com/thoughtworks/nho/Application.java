package com.thoughtworks.nho;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * @author : jianbo.wang
 * @date : 2019-04-20  14:28
 */
@SpringBootApplication
@MapperScan("com.thoughtworks.nho.dao")
public class Application {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }
}
