package inject.complex;

import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        ApplicationContext application = new ClassPathXmlApplicationContext("springContext_complex.xml");

        UserServiceImple  userService= application.getBean("userService",UserServiceImple.class);
        userService.update();
    }
}
