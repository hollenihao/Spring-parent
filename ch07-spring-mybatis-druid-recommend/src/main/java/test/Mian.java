package test;

import com.entity.Employe;
import com.service.EmployeService;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.util.List;

public class Mian {
    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
        EmployeService service = context.getBean("employeeService",EmployeService.class);

         List<Employe> employes = service.getAll(3,2);
        for(Employe employe : employes) {
            System.out.println("employe--:" + employe);
        }
    }
}
