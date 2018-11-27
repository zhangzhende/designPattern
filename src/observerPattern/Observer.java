package observerPattern;

/**
 * 观察者抽象类
 *
 * 也可以用接口，让具体的需要通知的类去实现这个接口即可
 */
public abstract class Observer {
    protected String name;
    protected Subject sub;

    public Observer(String name, Subject sub) {
        this.name = name;
        this.sub = sub;
    }

    public abstract void update();
}
