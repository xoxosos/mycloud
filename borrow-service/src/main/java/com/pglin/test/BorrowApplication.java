package com.pglin.test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.cloud.openfeign.EnableFeignClients;


/**
 * @author LinRenJie
 */
@SpringBootApplication
@EnableFeignClients
@EnableHystrix //hystrix 降级 当有相互依赖的服务挂了后，会有一个补救方案
public class BorrowApplication {
    public static void main(String[] args) {
        SpringApplication.run(BorrowApplication.class, args);
    }
}
