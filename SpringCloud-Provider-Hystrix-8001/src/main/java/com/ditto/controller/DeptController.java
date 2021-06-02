/**
 * @Description
 * @Author
 * @Date 2021/05/28 14:24:06
 * @Version
 */
package com.ditto.controller;

import com.ditto.pojo.Dept;
import com.ditto.service.DeptService;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

//提供Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //获取微服务的信息
    @Autowired
    private DiscoveryClient client;

    @GetMapping("/dept/get/{id}")
    //失败调用指定方法
    @HystrixCommand(fallbackMethod = "hystrixGet")
    public Dept get(@PathVariable("id")Long id){
        Dept dept = deptService.queryById(new Long((Long) id));

        //熔断：抛出异常结束
        if (dept == null){
            throw new RuntimeException("id=>"+id+"，不存该该用户，或信息无法找到");
        }

        return dept;
    }

    //熔断：选择备选方案
    public Dept hystrixGet(@PathVariable("id")Long id){
        return new Dept().setDeptno(id)
                .setDname("id=>"+id+"，不存该该用户，或信息无法找到")
                .setDb_source("No This Database in MySQL");
    }
}
