package spring;

import org.springframework.beans.BeansException;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import javax.servlet.ServletContext;
import javax.servlet.ServletContextEvent;
import javax.servlet.ServletContextListener;
import java.security.KeyStore;

public class ApplicationContextInstantiateListerner implements ServletContextListener {
    private static final String SPRING_CONTAINER_KEY = "SPRING_CONTAINER";

    //上下文初始化
    @Override
    public void contextInitialized(ServletContextEvent sce) {
        ServletContext servletContext = sce.getServletContext();
        String configFile = servletContext.getInitParameter("configFile");
          ApplicationContext context = new ClassPathXmlApplicationContext(configFile);

    servletContext.setAttribute(SPRING_CONTAINER_KEY,context);
    }

    @Override
    public void contextDestroyed(ServletContextEvent sce) {

    }
}
