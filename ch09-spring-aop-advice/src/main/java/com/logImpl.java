package com;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.util.LangUtil;

public class logImpl {
    public void before(){
        System.out.println("before****");
    }
    public void after(){
        System.out.println("after****");
    }

    public void afterReturn(){
        System.out.println("afterReturn***");
    }

    public void throwing(RuntimeException re){
        System.out.println("runtimeException" + re);
        System.out.println("throwing***");
    }

    /**
     * around环绕通知类型是proceedingJointPoint类型
     *它是jointPoint的子类型
     * 但环绕通知类型参数不能写jointPoint类型
     */
    public Object aroundAdvice(ProceedingJoinPoint joinPoint){

            Object result = null;
        System.out.println("aroundAdvice***");
        try {
            result = joinPoint.proceed();
        }catch (Throwable throwable){
            System.out.println("aroundAdvice throw ***");
        }
        System.out.println("aroundAdvice after***");
        return result;
    }

    public Object aroundAdvice2(ProceedingJoinPoint joinPoint){

       Object   result = null;
        System.out.println("before 222");
       try {
           result = joinPoint.proceed();
       }catch (Throwable throwable){
           new RuntimeException("sdflkjkf");
       }
        System.out.println("after22");
        return result;
    }
}
