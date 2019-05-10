package com.example.feigncomsumer.controller;

import com.example.feigncomsumer.impl.IFeignProvider2;
import com.example.feigncomsumer.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;

    @Autowired
    IFeignProvider2 iFeignProvider2;


    //    point to feign-provider
    @RequestMapping("/toIndex")
    public String toIndex2() {
        return testService.toIndex2();
    }

    //
    //    point to feign-provider2
    @RequestMapping("/toS")
    public String toShow() {
        return iFeignProvider2.toShow("I Love You,Xiehui");
    }


   @RequestMapping("/toO")
    public String toOther() {
        return testService.toOther();
    }

}
