package org.spring.aop.advice.aspect;

import org.aspectj.lang.ProceedingJoinPoint;

public class MyAsceptHandle {
    public void after(){
        System.out.println("after");
    }
    public void afterReturning(){
        System.out.println("afterReturning");
    }
    public void afterThrowing(Exception ex){
        System.out.println("afterThrowing");
    }
    public void before(){
        System.out.println("before");
    }
    public Object arround(ProceedingJoinPoint proceedingJoinPoint) throws Throwable {
        System.out.println("arround:---------------");
        before();
        Object result = proceedingJoinPoint.proceed();
        after();
        return result;
    }
}
