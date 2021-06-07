/**
 * @Description
 * @Author
 * @Date 2021/06/07 14:04:56
 * @Version
 */
package com.ditto.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ConfigClientLANController {

    @Value("${spring.application.name}")
    private String applicationName;

    @Value("${eureka.client.service-url.defaultZone}")
    private String eurekaServer;

    @Value("${server.port}")
    private String port;

    @RequestMapping("/config")
    public String getConfig(){
        System.out.println("applicationName:  " + applicationName +
                "\neurekaServer:  " + eurekaServer +
                "\nport:  " + port);
        return "applicationName:  " + applicationName +
                "\neurekaServer:  " + eurekaServer +
                "\nport:  " + port;
    }
}
