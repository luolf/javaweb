package org.spring.aop.advice;

import org.springframework.aop.MethodBeforeAdvice;

import java.lang.reflect.Method;

public class MyBeforeAdvice implements MethodBeforeAdvice {
    @Override
    public void before(Method method, Object[] objects, Object o) throws Throwable {
        System.out.println("我的前置通知");
        System.out.println(method);
        System.out.println(objects);
        System.out.println(o);
        System.out.println("我的前置通知处理结束");
    }
}
