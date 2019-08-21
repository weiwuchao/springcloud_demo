package com.wwc.springcloud_zuul;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
//从Spring Cloud Edgware开始，@EnableDiscoveryClient 或@EnableEurekaClient 可省略，添加依赖即可
@EnableDiscoveryClient
public class SpringcloudZuulApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudZuulApplication.class, args);
    }

}
