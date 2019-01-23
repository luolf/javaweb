package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

//注解方式使用mvc
@Controller
public class SpringMVCController {
    @RequestMapping("/test")
    @ResponseBody
    public String getName(){
        System.out.println("run");
        return "luolf中国";
    }
}
