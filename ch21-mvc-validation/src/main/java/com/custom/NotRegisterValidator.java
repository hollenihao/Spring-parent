package com.custom;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * NotRegister对应自定义注解效验，string是传过来的形式，比喻有点问题
 */

public class NotRegisterValidator implements ConstraintValidator<NotRegister,String> {
    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
            if(value != null && value.equals("admin")){
                return false;
            }else{
                return true;
            }
    }
}
