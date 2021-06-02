/**
 * @Description
 * @Author
 * @Date 2021/06/01 16:40:12
 * @Version
 */
package com.ditto.myRule;

import com.netflix.loadbalancer.IRule;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class DittoRule {

    @Bean
    public IRule myRule(){
        return new DittoRandomRule();
    }
}
