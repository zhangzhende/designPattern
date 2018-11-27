package abstractFactoryPattern;

/**
 * sqlserver对department操作的具体实现类
 */
public class SqlServerDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("sqlserver 中添加一个department");
    }

    @Override
    public Department getDepartment(String id) {
        System.out.println("sqlserver 中查询一个department");

        return null;
    }
}
