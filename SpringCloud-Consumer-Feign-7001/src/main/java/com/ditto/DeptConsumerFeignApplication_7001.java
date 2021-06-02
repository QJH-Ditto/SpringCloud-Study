/**
 * @Description
 * @Author
 * @Date 2021/05/28 16:29:32
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication(scanBasePackages = "com.ditto")
@EnableEurekaClient
@EnableFeignClients(basePackages = {"com.ditto"})
public class DeptConsumerFeignApplication_7001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerFeignApplication_7001.class,args);
    }
}
