package dynamic;


import org.springframework.beans.BeansException;
import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.BeanFactoryAware;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.beans.factory.support.BeanDefinitionBuilder;
import org.springframework.beans.factory.support.BeanDefinitionRegistry;

public class DynamicRegisstrator implements BeanFactoryAware {

    private BeanFactory beanFactory;
    @Override
    public void setBeanFactory(BeanFactory beanFactory) throws BeansException {
        this.beanFactory = beanFactory;
    }

    public <T> T segister(String name, Class<T> clz,Object... args){
        BeanDefinitionBuilder builder = BeanDefinitionBuilder.genericBeanDefinition(clz);
            for (Object arg:args){
            builder.addConstructorArgValue(args);
            }

        BeanDefinition definition =builder.getBeanDefinition();

        ((BeanDefinitionRegistry)beanFactory).registerBeanDefinition(name,definition);
        return  beanFactory.getBean(name,clz);
    }
}
