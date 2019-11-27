package test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        testSpring();
    }

    public static void testSpring(){
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext_resource_tes.xml");
        SrpingResourceTest resourceTest = context.getBean("resourceTest",SrpingResourceTest.class);

        System.out.println("resourceTest = " + resourceTest);;
    }
}
