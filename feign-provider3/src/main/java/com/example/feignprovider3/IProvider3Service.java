package com.example.feignprovider3;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

@Component
@FeignClient(value = "feign-provider")
public interface IProvider3Service {


    @RequestMapping("/getStuMess")
    String getStuMess();


}
