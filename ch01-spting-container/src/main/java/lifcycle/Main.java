package lifcycle;

import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("springConter_lifecycle.xml");

//        LifcycleDao dao = applicationContext.getBean("lifecycle",LifcycleDao.class);
//        LifcycleDao dao2 = applicationContext.getBean("lifecycle",LifcycleDao.class);

        LufcycleDao2 dao3 = applicationContext.getBean("lifecycle2",LufcycleDao2.class);

        ((ConfigurableApplicationContext)applicationContext).close();
    }


}
