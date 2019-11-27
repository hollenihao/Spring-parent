package aware;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("springConter_awre.xml");

        SomeBaen someBaen =context.getBean("awre",SomeBaen.class);

        ApplicationContext context1 = someBaen.getContext();

        System.out.println(context == context1);
    }
}
