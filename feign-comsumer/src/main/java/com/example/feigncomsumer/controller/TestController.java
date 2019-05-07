package com.example.feigncomsumer.controller;

import com.example.feigncomsumer.impl.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

    @Autowired
    TestService testService;


    @RequestMapping("/toIndex2")
    public String toIndex2() {
        System.out.println("toIndex2");
        return testService.toIndex2();
    }
}
