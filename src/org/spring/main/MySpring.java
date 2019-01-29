package org.spring.main;

import org.spring.beans.bo.Framework;
import org.spring.controller.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyAdvice;

public class MySpring {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        System.out.println("begin");
        Framework framework= applicationContext.getBean("framework",Framework.class);
        Demo demo= applicationContext.getBean("demo",Demo.class);
//        for(String s:applicationContext.getBeanDefinitionNames()){
//            System.out.println(s);
//        }
        //自己创建的对象不会被aop
//        Framework framework=new   Framework();
        framework.setId(1L);

        try {
            framework.getId();
        } catch (Exception e) {
            System.out.println("调用getId异常"+e.getMessage());
        }

        System.out.println("-------------------------------------");
        demo.setName("luolf");
        demo.sayHello(demo.getName());
    }
}
