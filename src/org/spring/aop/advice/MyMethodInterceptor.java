package org.spring.aop.advice;

import org.springframework.cglib.proxy.MethodInterceptor;
import org.springframework.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

public class MyMethodInterceptor implements MethodInterceptor {
    @Override
    public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {
        System.out.println("org.springframework.cglib.proxy.MethodInterceptor:环绕前置处理");
        Object result=methodProxy.invoke(o,objects);
        System.out.println("org.springframework.cglib.proxy.MethodInterceptor:环绕后置处理");
        return result;
    }
}
