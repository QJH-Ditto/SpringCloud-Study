/**
 * @Description
 * @Author
 * @Date 2021/06/07 10:09:15
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableDiscoveryClient
@EnableConfigServer
public class ConfigServerLANApplication6002 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerLANApplication6002.class,args);
    }
}
