package com.aop;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.stereotype.Component;

@Component //表名1被spring管理起来
@Aspect //表名此类是切面类
public class LogAspect {

    @Pointcut("execution( * com.service..*.*(..))")
    public void myPointcut(){

    }
    @Before("myPointcut()")
    public void before(){
        System.out.println();
    }

    @AfterReturning(pointcut = "myPointcut()",returning = "ret")
    public void afterReturning(int ret){
        System.out.println("ret");
    }

@AfterThrowing(pointcut = "myPointcut()" ,throwing = "re",argNames = "re")
public void afterThrowing(RuntimeException re){
    System.out.println("xxxxxxxxx" + re);
}

    @Around("myPointcut()")
    public Object around(ProceedingJoinPoint joinpoint){
        Object result = null;
        try {
            result = joinpoint.proceed();
        } catch (Throwable throwable) {
            throwable.printStackTrace();
        }
        System.out.println("after around---");
        return result;
    }

}
