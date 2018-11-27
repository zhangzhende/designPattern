package adapterPattern;

/**
 * 我们希望不改动现有的代码，希望新加的也能以现在这样的方式调用
 * Created by Administrator on 2018/11/26 0026.
 */
public class BioRobot implements Robot {
    public void move() {
        System.out.println("bio move....");
    }

    public void cry() {
        System.out.println("bio cry....");
    }
}
