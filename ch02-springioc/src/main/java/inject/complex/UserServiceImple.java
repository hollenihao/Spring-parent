package inject.complex;

public class UserServiceImple implements UserService {

    private UserDaoImpl dao;

    String ai;


    //只用set方法注入不要个体，spring才不管
    public void setAi(String ai) {
        this.ai = ai;
    }

    public void setDao(UserDaoImpl dao) {
        System.out.println("aupd");
        this.dao = dao;
    }

    @Override
    public void update() {
        System.out.println("set***");
        dao.update();
    }
}
