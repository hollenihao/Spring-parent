package com;


import javax.servlet.ServletContext;
import javax.servlet.ServletRegistration;

public class MyAppInitializerImpl implements MyAppInitializer {

    @Override
    public void dangQiDongShi(ServletContext servletContext) {
        ServletRegistration.Dynamic  servletRegistration= servletContext.addServlet("second",new SecondServlet());
        servletRegistration.addMapping("/second");
    }
}
