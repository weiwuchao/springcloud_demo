package com.wwc.springcloud_eurakeserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class SpringcloudEurakeserverApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringcloudEurakeserverApplication.class, args);
    }

}
