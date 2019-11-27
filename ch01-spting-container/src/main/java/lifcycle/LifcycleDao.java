package lifcycle;

public class LifcycleDao {
    public void init(){
        System.out.println("这个初始化代码是方法");
    }
    public void init2(){
        System.out.println("这个初始化代码是方法2");
    }

    public void destroy(){
        System.out.println("销毁");
    }
}
