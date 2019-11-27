package com;

import javax.servlet.ServletContainerInitializer;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.HandlesTypes;
import java.util.Set;

/**
 * servlet3的新特性
 * 用代码来注册不用在web.xml注册
 *
 */

@HandlesTypes(MyAppInitializer.class)
public class MyServletContainerInt implements ServletContainerInitializer {

    //第一种方法
//    @Override
//    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {
//        ServletRegistration.Dynamic servletRegistration =ctx.addServlet("first",new FirstServlet());
//        servletRegistration.addMapping("/first");
//    }

    @Override
    public void onStartup(Set<Class<?>> c, ServletContext ctx) throws ServletException {

        for (Class<?> clz:c){
                if (MyAppInitializer.class.isAssignableFrom(clz)){
                    try {
                        MyAppInitializer initializer = (MyAppInitializer) clz.newInstance();
                        initializer.dangQiDongShi(ctx);
                    } catch (InstantiationException e) {
                        e.printStackTrace();
                    } catch (IllegalAccessException e) {
                        e.printStackTrace();
                    }
                }
        }
    }
}
