/**
 * @Description
 * @Author
 * @Date 2021/06/03 15:33:40
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.dashboard.EnableHystrixDashboard;

@SpringBootApplication
@EnableHystrixDashboard//开启监控页面
public class ConsumerHystrixDashBoardApplication {
    public static void main(String[] args) {
        SpringApplication.run(ConsumerHystrixDashBoardApplication.class,args);
    }
}
