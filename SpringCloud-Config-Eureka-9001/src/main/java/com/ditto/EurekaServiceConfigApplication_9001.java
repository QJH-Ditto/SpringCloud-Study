/**
 * @Description
 * @Author
 * @Date 2021/05/31 08:56:50
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer //Eureka服务端启动类
public class EurekaServiceConfigApplication_9001 {
    public static void main(String[] args) {
        SpringApplication.run(EurekaServiceConfigApplication_9001.class,args);
    }
}
