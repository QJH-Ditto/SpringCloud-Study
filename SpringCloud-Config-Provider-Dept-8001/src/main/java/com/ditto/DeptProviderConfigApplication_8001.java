/**
 * @Description
 * @Author
 * @Date 2021/05/28 14:31:18
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient //开启服务端注册到注册中心
@EnableDiscoveryClient //开启服务发现
public class DeptProviderConfigApplication_8001 {
    public static void main(String[] args) {
        SpringApplication.run(DeptProviderConfigApplication_8001.class,args);
    }
}
