package lifcycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class LufcycleDao2 implements InitializingBean, DisposableBean {


    @Override
    public void destroy() throws Exception {
        System.out.println("--destroy");
    }

    @Override
    public void afterPropertiesSet() throws Exception {
        System.out.println("--afterPropertiesSet: init");
    }
}
