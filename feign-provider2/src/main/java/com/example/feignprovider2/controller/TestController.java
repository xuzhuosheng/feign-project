package com.example.feignprovider2.controller;


import com.example.feignprovider2.ITestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class TestController {

    @Autowired
    ITestService iTestService;

    @RequestMapping("/toShow")
    public String toShow(String showP) {
        System.out.println("this is fucntion toShow");
        return showP + "------by feign-provider2"  ;
    }


    @RequestMapping("/toOther")
    public String toOther(){
        return "to feign-provider module";

    }

}
