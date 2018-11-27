package abstractFactoryPattern;

/**
 * 用户操作的所有方法，不同的数据库不同的实现，但是都有这些方法
 */
public interface IUser {
    void insertUser(User user);

    User getUser(String id);
}
