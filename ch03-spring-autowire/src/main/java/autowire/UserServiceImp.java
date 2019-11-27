package autowire;

public class UserServiceImp implements UserService {
    UserDao dao;

    public void setUserDao(UserDao userDao) {
        this.dao = userDao;
    }

    @Override
    public void update() {
        dao.update();
    }
}
