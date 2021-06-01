/**
 * @Description
 * @Author
 * @Date 2021/05/28 15:46:43
 * @Version
 */
package com.ditto.config;

import com.netflix.loadbalancer.IRule;
import com.netflix.loadbalancer.RandomRule;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

@Configuration
public class ConfigBean {

    //配置负载均衡实现RestTemplate
    @Bean
    //开启Ribbon负债均衡
    //默认轮询算法
    //IRule接口实现类定义Ribbon算法
    //RoundRobinRule 轮询算法
    //RandomRule 随机算法
    //RetryRule 轮询算法，指定时间内没有找到服务继续轮询
    //AvailabilityFilteringRule:先过滤掉跳闸，访问故障的服务，对剩下的服务采用轮询算法
    @LoadBalanced
    public RestTemplate getRestTemplate(){
        return new RestTemplate();
    }

}
