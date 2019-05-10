package com.example.feignprovider2;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "feign-provider")
public interface ITestService {

    @RequestMapping("/toPro")
    String toPro(String Str);
}
