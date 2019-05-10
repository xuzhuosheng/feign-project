package com.example.feignprovider3;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Provider3Controller {

    @Autowired
    IProvider3Service iProvider3Service;

    @RequestMapping("/toOther")
    public String toOther() {
        /* Student student = new Student("xzs", '0', 27, "13413451134");*/
        System.out.println("this is provider3");
        String a = iProvider3Service.getStuMess();
        return a + "------this is provider3";
    }

    @RequestMapping("/toIndex")
    public String toIndex() {
        return "------this is provider3";
    }

}
