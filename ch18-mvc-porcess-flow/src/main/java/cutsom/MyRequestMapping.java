package cutsom;

import org.springframework.web.bind.annotation.Mapping;
import org.springframework.web.servlet.HandlerExecutionChain;
import org.springframework.web.servlet.HandlerMapping;

import javax.servlet.http.HttpServletRequest;
import java.util.Map;

public class MyRequestMapping implements HandlerMapping {
    private Map<String,Class<?>> handlers;


    public void setHandlers(Map<String, Class<?>> handlers) {
        this.handlers = handlers;
    }

    @Override
    public HandlerExecutionChain getHandler(HttpServletRequest request) throws Exception {
        Class<?> handlerClass = handlers.get(request.getRequestURL());
        Object handler = handlerClass.newInstance();

        HandlerExecutionChain chain = new HandlerExecutionChain(handler);
        return chain;
    }
}
