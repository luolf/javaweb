package org.spring.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

//注解方式使用mvc
@Controller
public class SpringMVCController {
    @RequestMapping("/test")
    @ResponseBody
    public String getName(){
        System.out.println("run");
        return "luolf中国";
    }
    @RequestMapping("/test2")
    public String getName2(HttpServletRequest httpServletRequest, Model model){
        System.out.println("httpServletRequest="+httpServletRequest);
        System.out.println("httpServletSession="+httpServletRequest.getSession());
        model.addAttribute("country","中国");
        return "/index.jsp";
    }
}
