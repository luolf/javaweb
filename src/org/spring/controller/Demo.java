package org.spring.controller;

import org.aspectj.lang.annotation.Pointcut;
import org.spring.annotation.MyAnnotation;
import org.springframework.stereotype.Component;

@Component
public class Demo {
    String name;
    public String getName(){
        return name;
    }
    @MyAnnotation(value = "打招呼")
    public void sayHello(String name){
        System.out.println("hello:"+name);

    }
    @Pointcut("execution(* org.spring.controller.Demo.setName(String))")
    public void setName(String name){
        this.name=name;
    }

}
