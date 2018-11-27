package abstractFactoryPattern;


/**
 * 使用简单工厂模式来优化抽象工厂的部分代码，可减少sqlserverFactory，accessFactory,IFactory等
 */
public class DataAccess {
    private static final String db="sqlserver";
    public static IUser createUser(){
        IUser result=null;
        switch (db){
            case "sqlserver":
                result=new SqlServerUser();
                break;
            case "access":
                result=new AccessUser();
                break;
        }
        return result;
    }

    public static IDepartment createDepartment(){
        IDepartment result=null;
        switch (db){
            case "sqlserver":
                result=new SqlServerDepartment();
                break;
            case "access":
                result=new AccessDepartment();
                break;
        }
        return  result;
    }
}
