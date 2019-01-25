package org.spring.aop.advice;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.aspectj.lang.reflect.MethodSignature;
import org.spring.annotation.MyAnnotation;
import org.spring.controller.Demo;
import org.springframework.core.annotation.AnnotationUtils;
import org.springframework.stereotype.Component;

import java.lang.reflect.Method;

/**
 * Created with IntelliJ IDEA.
 * Description:
 * User: luolifeng
 * Date: 2019-01-25
 * Time: 15:54
 */
@Component
@Aspect
public class AspectAnnotation {
    //切点来源注解
    @Pointcut(value = "@annotation(org.spring.annotation.MyAnnotation)")
    public void anotationPCAlias(){
    }
//    //定义切点并起个切点别名，切点别名为方法名useAlias()
    @Pointcut("execution(* org.spring.controller.Demo.getName())")
    public void useAlias(){
        System.out.println( "定义了个切点别名" );
    }

    //指定切点名称
    @Around("execution(* org.spring.controller.Demo.setName(String))")
//    @Around("org.spring.controller.Demo.setName()")
    public Object arround(ProceedingJoinPoint joinPoint)  throws  Throwable {
        System.out.println( "外部定义切点名：环绕通知执行方法前"+joinPoint.getSignature().getName() );
        // 手动执行目标方法
        Object obj = joinPoint.proceed();

        System.out.println( "外部定义切点名：环绕通知执行方法后"+joinPoint.getSignature().getName());
        return  obj;
    }


    //使用切点别名方式
    @After("useAlias()")
    public void aftergetName(JoinPoint joinPoint ) {
        System.out.println( "切点别名:后置通知 ： "  + joinPoint.getSignature().getName()  );

    }
    //使用切点别名方式(来自注解)
    @Before("anotationPCAlias()")
    public void before(JoinPoint joinPoint){
        // 对象类型
        Object obj = joinPoint.getTarget();
//类上的注解
//        MyAnnotation myAnnotation=  AnnotationUtils.findAnnotation(obj.getClass(), MyAnnotation.class);
        // 方法上的注解
        MethodSignature methodSignature = (MethodSignature) joinPoint.getSignature();
        Method method = methodSignature.getMethod();
        MyAnnotation myAnnotation = AnnotationUtils.getAnnotation(method, MyAnnotation.class);
        String value = myAnnotation.value();

        System.out.println(value+"切点注解别名:前置通知： "+joinPoint.getSignature().getName());
    }
    @Before("useAlias()")
    public void beforeGetName(JoinPoint joinPoint){
        System.out.println("切点别名:前置通知： "+joinPoint.getSignature().getName());
    }
}
