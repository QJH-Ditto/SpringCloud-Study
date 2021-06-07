/**
 * @Description
 * @Author
 * @Date 2021/06/04 09:54:18
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@SpringBootApplication
@EnableZuulProxy //开启zuul
public class ZuulApplication_8004 {
    public static void main(String[] args) {
        SpringApplication.run(ZuulApplication_8004.class,args);
    }
}
