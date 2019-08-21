package com.wwc.springcloud_hystrix.service;

import com.wwc.springcloud_hystrix.client.IApiService;
import org.springframework.stereotype.Component;

@Component
public class ApiErrorService implements IApiService {
    @Override
    public String index() {
        return "服务发生故障";
    }
}
