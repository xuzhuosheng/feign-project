package com.example.feignprovider;


import com.example.feignprovider.entity.Student;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {


    public String motherName = "feiyi";


    @RequestMapping("/toIndex")
    public String toIndex() {
        Student student = new Student("xzs", '0', 27, "13413451134");
        return student.toString() + "------first eureka Demo";
    }


    @RequestMapping("/getStuMess")
    public String getStuMess() {
        Student student = new Student("xiehui", '0', 28, "13413451134");
        return student.toString();
    }

}
