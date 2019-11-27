package com.aspect;


import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.stereotype.Component;
import sun.rmi.runtime.Log;

/*
工具类注解用component
 */
@Component
@Aspect
public class performanceAspect {
    @Pointcut("execution(* com.servic..*.*(..))")
    public void pointcut() {

    }

    @Around("pointcut()")
    public Object performance(ProceedingJoinPoint joinPoint){
        Object result = null;
        try {
            Long start =System.currentTimeMillis();
            result  = joinPoint.proceed();
            Long end = System.currentTimeMillis();
            System.out.println("耗时："+ (end-start));
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
       return  result;
    }
}