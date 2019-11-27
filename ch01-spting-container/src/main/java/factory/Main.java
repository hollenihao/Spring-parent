package factory;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext_Factory.xml");

        //是利用工厂类得到的对象
        A instance = applicationContext.getBean("factory",A.class);
        System.out.println(instance.getClass().getName());
    }
}
