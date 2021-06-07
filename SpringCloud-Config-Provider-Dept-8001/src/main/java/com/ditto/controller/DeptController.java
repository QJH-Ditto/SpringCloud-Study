/**
 * @Description
 * @Author
 * @Date 2021/05/28 14:24:06
 * @Version
 */
package com.ditto.controller;

import com.ditto.pojo.Dept;
import com.ditto.service.DeptService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

//提供Restful服务
@RestController
public class DeptController {

    @Autowired
    private DeptService deptService;

    //获取微服务的信息
    @Autowired
    private DiscoveryClient client;

    @PostMapping("/dept/add")
    public boolean addDept( Dept dept){

       return deptService.addDept(dept);
    }

    @GetMapping("/dept/get/{id}")
    public Dept get(@PathVariable("id")Long id){
        Dept dept = deptService.queryById(id);
        if (dept == null){
            throw new RuntimeException("Fail");
        }
        return dept;
    }

    @GetMapping("/dept/list")
    public List<Dept> queryALL(){

        return deptService.queryAll();
    }

    @GetMapping("/dept/discovery")
    public Object discovery(){
        //获取微服务列表清单
        List<String> services = client.getServices();
        System.out.println("services=>"+services);

        //得到一个具体的微服务信息(通过微服务ID)

        List<ServiceInstance> instances = client.getInstances("SPRINGCLOUD-PROVIDER-DEPT");

        for (ServiceInstance instance : instances) {
            System.out.println(
                    instance.getHost() + "\t" +
                    instance.getPort() + "\t" +
                    instance.getUri() + "\t" +
                    instance.getServiceId()
            );

        }
        return this.client;
    }
}
