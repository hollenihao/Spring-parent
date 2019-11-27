package com.nf.demo.advice;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

/**
 * 顶级异常类
 * 跟，事务类，报错
 */
@ControllerAdvice
public class ExceptionControllerAdvice {
        @ExceptionHandler(RuntimeException.class)
        public String handlerRuntime(){
            return "error";
        }
}
