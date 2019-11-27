package process;

import javafx.fxml.Initializable;
import org.springframework.beans.factory.InitializingBean;

public class A implements InitializingBean {
    B b;
    C c;
    public A(B b,C c){
        System.out.println("A有参构造函数");
        this.b = b;
        this.c = c;
    }

    public void setB(B b) {
        System.out.println("A的setb方法");
        this.b = b;
    }
    public void init(){
        System.out.println( "A的init方法");
    }

    @Override
    public void afterPropertiesSet() throws Exception {

    }
}
