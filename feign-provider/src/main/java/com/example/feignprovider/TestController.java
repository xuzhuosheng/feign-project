package com.example.feignprovider;


import com.example.feignprovider.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    @RequestMapping("/toIndex")
    public String toIndex() {
        Student student = new Student("xzs", '0', 27, "13413451134");
        return student.toString();
    }

}
