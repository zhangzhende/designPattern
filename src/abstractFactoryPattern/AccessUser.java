package abstractFactoryPattern;

/**
 * access的数据库操作实现
 */
public class AccessUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("access 中添加一个 user");
    }

    @Override
    public User getUser(String id) {
        System.out.println("access 中查询一个 user");
        return null;
    }
}
