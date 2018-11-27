package SingletonPattern;

/**
 * 解决基本情况下的问题，
 * 通过加锁的方式实现
 * Created by Administrator on 2018/11/26 0026.
 */
public class SynBaseClass {
    private static SynBaseClass synBaseClass;


    private SynBaseClass() {

    }

    public static synchronized SynBaseClass getInstance() {
        if (synBaseClass == null) {
            synBaseClass = new SynBaseClass();
        }
        return synBaseClass;
    }
}
