package org.spring.main;

import org.spring.beans.bo.Framework;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MySpring {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Framework framework= applicationContext.getBean("frw",Framework.class);
//        for(String s:applicationContext.getBeanDefinitionNames()){
//            System.out.println(s);
//        }
        //自己创建的对象不会被aop
//        Framework framework=new   Framework();
        framework.setId(1L);
        System.out.println("调用getId");
        try {
            framework.getId();
        } catch (Exception e) {
            System.out.println("调用getId异常");
        }

    }
}
