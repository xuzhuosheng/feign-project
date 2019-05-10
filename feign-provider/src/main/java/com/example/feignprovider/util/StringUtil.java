package com.example.feignprovider.util;

import org.springframework.web.bind.annotation.RequestMapping;

public class StringUtil {

    @RequestMapping("/toPro")
    public String returnStr(String Str) {
        return "i will return your enter str:" + Str;
    }

}
