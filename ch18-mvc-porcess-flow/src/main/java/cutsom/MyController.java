package cutsom;

import org.springframework.web.servlet.ModelAndView;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@MvcController
public class MyController {

    public ModelAndView process(HttpServletRequest request, HttpServletResponse response){

        ModelAndView modelAndView = new ModelAndView();
        modelAndView.setViewName("WEB-INF/JSP/flow.jsp");
        modelAndView.addObject("fl","flow ");

        return modelAndView;
    }
}
