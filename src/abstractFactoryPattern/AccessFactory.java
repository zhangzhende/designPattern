package abstractFactoryPattern;

/**
 * 创建access操作类工厂的具体实现
 */
public class AccessFactory implements IFactory {
    @Override
    public IUser createIuser() {

        return new AccessUser();
    }

    @Override
    public IDepartment createIdepartment() {

        return new AccessDepartment();
    }
}
