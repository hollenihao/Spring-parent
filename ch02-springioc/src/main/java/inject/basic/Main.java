package inject.basic;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.sql.SQLOutput;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springContext_dasic.xml");

       DnConfig dnConfig = applicationContext.getBean("dbConfig",DnConfig.class);
        UserInfo userInfo =  applicationContext.getBean("userInfo",UserInfo.class);
          System.out.println(dnConfig);
        System.out.println(userInfo);

    }
}
