package abstractFactoryPattern;

/**
 * 创建不同数据操作类的工厂
 */
public interface IFactory {
    IUser createIuser();
    IDepartment createIdepartment();
}
