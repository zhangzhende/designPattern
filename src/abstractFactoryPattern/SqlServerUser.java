package abstractFactoryPattern;

/**
 * sqlserver的数据库操作实现
 */
public class SqlServerUser implements IUser {
    @Override
    public void insertUser(User user) {
        System.out.println("sqlserver 中添加一个 user");
    }

    @Override
    public User getUser(String id) {
        System.out.println("sqlserver 中查询一个 user");
        return null;
    }
}
