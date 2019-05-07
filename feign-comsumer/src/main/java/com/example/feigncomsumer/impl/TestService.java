package com.example.feigncomsumer.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient("feign-provider")
public interface TestService {

    @RequestMapping("/toIndex")
    String toIndex2();

}
