package com.service;

/**报错：
 * Exception in thread "main" org.springframework.beans.
 * factory.BeanNotOfRequiredTypeException: Bean named
 * 'employee' is expected to be of type
 * 此类用不了额。。。
 * */

public class EmployeServiceImpl {
    /**    加入final就不会被代理，也就不会有注（织）入
     * 没有实现接口所以spring利用cglib创建子类的方式来创建aop代理
     */
    public final void insert(){
        System.out.println("insert employeeIml---");
    }

    public void delete(){
        System.out.println("employeeImpl delete");
    }
}
