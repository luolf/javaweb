package org.spring.aop.advice;

import org.springframework.aop.AfterReturningAdvice;

import java.lang.reflect.Method;

public class MyAfterAdvice implements AfterReturningAdvice {
    @Override
    public void afterReturning(Object o, Method method, Object[] objects, Object o1) throws Throwable {
        System.out.println("我的后置通知");
        System.out.println(o);
        System.out.println(method);
        System.out.println(objects);
        System.out.println(o1);
        System.out.println("我的后置通知处理结束");
    }
}
