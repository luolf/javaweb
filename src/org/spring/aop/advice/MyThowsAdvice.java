package org.spring.aop.advice;

import org.springframework.aop.ThrowsAdvice;

import javax.servlet.ServletException;
import java.lang.reflect.Method;
import java.rmi.RemoteException;

public class MyThowsAdvice implements ThrowsAdvice {
    public void afterThrowing5(Exception ex) throws Throwable {
        System.out.println("我的MyThowsAdvice通知5");
        System.out.println(ex);
        System.out.println("我的MyThowsAdvice通知处理结束5");
    }
    public void afterThrowing0(Exception ex) throws Throwable {
        System.out.println("我的MyThowsAdvice通知0");
        System.out.println(ex);
        System.out.println("我的MyThowsAdvice通知处理结束0");
    }
//    public void afterThrowing(RemoteException ex) throws Throwable {
//        System.out.println("我的MyThowsAdvice通知");
//        System.out.println(ex);
//        System.out.println("我的MyThowsAdvice通知处理结束");
//    }
//
//    public void afterThrowing2(Method m, Object[] args, Object target, ServletException ex) {
//        System.out.println("我的MyThowsAdvice通知2");
//        System.out.println(m);
//        System.out.println(args);
//        System.out.println(target);
//        System.out.println(ex);
//        System.out.println("我的MyThowsAdvice通知处理结束2");
//    }
}
