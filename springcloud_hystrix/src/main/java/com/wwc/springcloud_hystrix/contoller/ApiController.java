package com.wwc.springcloud_hystrix.contoller;

import com.wwc.springcloud_hystrix.client.IApiService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ApiController {

    @Autowired
    private IApiService apiService;

    @RequestMapping(value="/indexCtrl", method= RequestMethod.GET)
    public String index()
    {
       return apiService.index();

    }
}
