package abstractFactoryPattern;

/**
 * access 对department的具体操作的实现
 */
public class AccessDepartment implements IDepartment {
    @Override
    public void insert(Department department) {
        System.out.println("access 中添加一个department");
    }

    @Override
    public Department getDepartment(String id) {
        System.out.println("access 中查询一个department");
        return null;
    }
}
