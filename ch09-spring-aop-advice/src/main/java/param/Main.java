package param;

import com.EmployeeServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.net.ConnectException;
import java.nio.channels.NonWritableChannelException;

public class Main {
    public static void main(String[] args) {
        ApplicationContext context  = new ClassPathXmlApplicationContext("applicationContext_param.xml4");

        EmployeeServiceImpl service = context.getBean("employeeService",EmployeeServiceImpl.class);

       int result = service.add(2,1);
        System.out.println("add = "+result);
    }
}