package SingletonPattern;

/**
 * 解决基本情况下的问题
 * 通过双重校验锁的方式
 * 两个校验然后再锁
 * Created by Administrator on 2018/11/26 0026.
 */
public class DoubleCheckSynBaseClass {
    private static DoubleCheckSynBaseClass doubleCheckSynBaseClass;

    private DoubleCheckSynBaseClass() {

    }

    private static DoubleCheckSynBaseClass getInstance() {
        if (doubleCheckSynBaseClass == null) {
            synchronized (DoubleCheckSynBaseClass.class) {
                if (doubleCheckSynBaseClass == null) {
                    doubleCheckSynBaseClass = new DoubleCheckSynBaseClass();
                }
            }
        }
        return doubleCheckSynBaseClass;
    }
}
