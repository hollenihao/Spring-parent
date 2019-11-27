package dynamic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;



public class Mian {
    public static void main(String[] args) {

        ApplicationContext context =new ClassPathXmlApplicationContext("springContext_dynamic.xml");

        DynamicRegisstrator regisstrator = context.getBean("dynamicregistrator",DynamicRegisstrator.class);

        //自己写的类调用
        B b = regisstrator.segister("b",B.class);
        System.out.println(b);

        //spring的类的方法常用getBean
        B b1 = context.getBean("b",B.class);
        System.out.println("b1--"+b1);
        //是否相等true
        System.out.println( b == b1);

    }
}
