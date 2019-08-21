package com.wwc.springcloud_openfeign.client;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

@FeignClient("eurekaclient")
public interface IApiService {

    @RequestMapping(value = "/index",method = RequestMethod.GET)
    String index();
}
