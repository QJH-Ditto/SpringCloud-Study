/**
 * @Description
 * @Author
 * @Date 2021/05/28 16:29:32
 * @Version
 */
package com.ditto;

import com.ditto.myRule.DittoRule;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.ribbon.RibbonClient;

@SpringBootApplication
@EnableEurekaClient
//自定义服务类以及负载均衡算法
@RibbonClient(name = "SpringCloud-Provider-dept",configuration = DittoRule.class)
public class DeptConsumerApplication {
    public static void main(String[] args) {
        SpringApplication.run(DeptConsumerApplication.class,args);
    }
}
