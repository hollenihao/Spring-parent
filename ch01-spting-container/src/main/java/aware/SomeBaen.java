package aware;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.Aware;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ApplicationContextAware;

public class SomeBaen implements ApplicationContextAware, BeanNameAware {
        private ApplicationContext context;

    public SomeBaen(ApplicationContext context) {
        this.context = context;
    }

    public SomeBaen() {

    }

    @Override
    public void setBeanName(String s) {

    }

    public ApplicationContext getContext(){
        return this.context;
    }
    @Override
    public void setApplicationContext(ApplicationContext applicationContext) throws BeansException {
        this.context = applicationContext;
    }
}



