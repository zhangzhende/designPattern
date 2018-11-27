package SingletonPattern;

/**
 * 基本实现
 *
 * 在并发的情况下会有问题，并发初始化时，getinstance会有问题
 * Created by Administrator on 2018/11/26 0026.
 */
public class BaseClass {
    private static BaseClass baseClass;
    private BaseClass() {

    }

    public static BaseClass getInstance() {
        if(baseClass==null){
            baseClass=new BaseClass();
        }
        return baseClass;
    }
}
