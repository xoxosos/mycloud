package com.pglin.test.config;

import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.cloud.loadbalancer.annotation.LoadBalancerClient;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.client.RestTemplate;

/**
 * @author LinRenJie
 */
@Configuration
public class BeanConfiguration {

//    @Bean
//    负载均衡 （后面使用openfeign代替restTemolate）
//    @LoadBalanced
//    public RestTemplate restTemplate(){
//     return new RestTemplate();
// }
}
