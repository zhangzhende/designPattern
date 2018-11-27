package abstractFactoryPattern;

/**
 * 抽象工厂模式2
 *
 *提供一个创建一系列相关的或者相互依赖的接口，而不需要指定他们具体的类
 *
 *
 * {本例是模拟切换数据库的场景，由于要切换数据库，相关的数据操作都不一样，利用抽象工厂模式，做到切换数据库时改动最小}
 *
 * 改进1，通过反射创建各操作的具体实现类，TODO
 *
 */
public class Main {
    public static void main(String[] args){
        User user=new User("1","zhangsan");
        Department department=new Department("1","dea");

        //使用sqlserver
//        IFactory sqlserverFactory=new SqlServerFactory();
//        IUser iUser=sqlserverFactory.createIuser();
//        iUser.insertUser(user);
//        iUser.getUser("1");
//
//        IDepartment iDepartment=sqlserverFactory.createIdepartment();
//        iDepartment.insert(department);
//        iDepartment.getDepartment("1");


        //使用access连接
        IFactory accessFactory=new AccessFactory();
        IUser iUser=accessFactory.createIuser();
        iUser.insertUser(user);
        iUser.getUser("1");

        IDepartment iDepartment=accessFactory.createIdepartment();
        iDepartment.insert(department);
        iDepartment.getDepartment("1");
    }
}
