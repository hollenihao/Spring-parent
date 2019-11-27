package contorller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import sun.management.snmp.jvmmib.EnumJvmMemoryGCVerboseLevel;

@Controller
public class HollerContorller {

@RequestMapping("/index")
 public  String handle(){
    System.out.println("jj-----------");
    return "helloword";
}


@RequestMapping("/index2")
    public ModelAndView handle2(){
    ModelAndView mvc = new ModelAndView();
    mvc.setViewName("helloword");
    mvc.addObject("re","Hello Word");
    return mvc;
    }
}
