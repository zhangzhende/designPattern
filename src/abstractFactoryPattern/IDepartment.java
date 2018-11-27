package abstractFactoryPattern;

/**
 * department操作类的所有方法
 */
public interface IDepartment {
    void insert(Department department);

    Department getDepartment(String id);
}
