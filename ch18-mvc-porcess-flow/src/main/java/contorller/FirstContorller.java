package contorller;

import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.AbstractController;

public class FirstContorller extends AbstractController {
    @Override
    protected ModelAndView handleRequestInternal(javax.servlet.http.HttpServletRequest request, javax.servlet.http.HttpServletResponse response) throws Exception {

        ModelAndView modelAndView = new ModelAndView("flow");

        return modelAndView.addObject("js","hahaha wo shi di yi ge");
    }
}
