package SingletonPattern;

/**
 * 解决基本情况下的问题
 * 通过直接初始化静态变量的方式
 * Created by Administrator on 2018/11/26 0026.
 */
public class StaticBaseClass {
    private static StaticBaseClass staticBaseClass=new StaticBaseClass();

    private StaticBaseClass(){

    }
    public static StaticBaseClass getInstance(){
        return staticBaseClass;
    }
}
