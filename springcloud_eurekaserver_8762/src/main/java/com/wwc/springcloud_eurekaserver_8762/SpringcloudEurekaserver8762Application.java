package com.wwc.springcloud_eurekaserver_8762;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class SpringcloudEurekaserver8762Application {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurekaserver8762Application.class, args);
    }

}
