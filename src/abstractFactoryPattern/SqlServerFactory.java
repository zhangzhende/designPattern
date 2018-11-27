package abstractFactoryPattern;

/**
 * 创建sqlserver操作类的接口实现类
 */
public class SqlServerFactory implements IFactory {
    @Override
    public IUser createIuser() {
        return new SqlServerUser();
    }

    @Override
    public IDepartment createIdepartment() {
        return new SqlServerDepartment();
    }
}
