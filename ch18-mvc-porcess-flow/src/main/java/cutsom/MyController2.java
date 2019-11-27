package cutsom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MvcController
public class MyController2 {
    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){
            ModelAndView modelAndView = new ModelAndView();

                modelAndView.setViewName("WEB-INF/jsp/flow.sjp");
         return modelAndView.addObject("cut","cutson ");
    }

}
