package org.spring.aop.advice;

import org.aopalliance.intercept.MethodInterceptor;
import org.aopalliance.intercept.MethodInvocation;

public class MyMethodInterceptorAliance implements MethodInterceptor {
    @Override
    public Object invoke(MethodInvocation methodInvocation) throws Throwable {
        System.out.println(" org.aopalliance.intercept.MethodInterceptor:环绕前置处理");
        Object o=methodInvocation.proceed();
        System.out.println(" org.aopalliance.intercept.MethodInterceptor:环绕后置处理");
        return o;
    }
}
