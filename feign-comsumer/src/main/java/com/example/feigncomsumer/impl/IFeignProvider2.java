package com.example.feigncomsumer.impl;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient("feign-provider2")
public interface IFeignProvider2 {

    @RequestMapping("/toShow")
    String toShow(@RequestParam("showP") String showP);

}
