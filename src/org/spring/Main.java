package org.spring;

import org.spring.beans.bo.Framework;
import org.spring.controller.Demo;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-01-25
 * Time: 16:54
 */
public class Main {
    public static void main(String[] args){
        ApplicationContext applicationContext=new ClassPathXmlApplicationContext("applicationContext.xml");
        Framework framework= applicationContext.getBean("framework",Framework.class);
        Demo demo= applicationContext.getBean("demo",Demo.class);
        for(String s:applicationContext.getBeanDefinitionNames()){
            System.out.println(s);
        }
        //自己创建的对象不会被aop
//        Framework framework=new   Framework();
        framework.setId(1L);
        System.out.println("调用getId");
        try {
            framework.getId();
        } catch (Exception e) {
            System.out.println("调用getId异常");
        }

        System.out.println("-------------------------------------");
        demo.setName("luolf");
        demo.sayHello(demo.getName());
    }
}
