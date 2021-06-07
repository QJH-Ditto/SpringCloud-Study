/**
 * @Description
 * @Author
 * @Date 2021/06/07 08:46:50
 * @Version
 */
package com.ditto;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;

@SpringBootApplication
@EnableConfigServer
public class ConfigServerGiteeApplication6001 {
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerGiteeApplication6001.class,args);
    }
}
